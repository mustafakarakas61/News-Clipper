package com.mustafa.newsclipper.service;

import com.mustafa.newsclipper.utils.StreamDump;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.mustafa.newsclipper.utils.TimeUtility.passingTime;

@Service
public class ClipService {
    String path = "C:\\MediaFiles\\";
    String info;
    Date time;
    private final Logger logger = LoggerFactory.getLogger(ClipService.class);

    public boolean clipVideo(String fileName, String ssTime, String toTime) throws IOException, InterruptedException {

        File sourcevideo = new File(path + fileName); //.mpg veya .mp4 geliyor
        Pattern pattern = Pattern.compile("mp[4g]");
        Matcher matcher = pattern.matcher(fileName);


        StringJoiner stringJoiner = new StringJoiner(" ");

        stringJoiner.add("ffmpeg");

        stringJoiner.add("-y");
        stringJoiner.add("-i");
        stringJoiner.add(sourcevideo.toString());
        stringJoiner.add("-c:v libx264");
        stringJoiner.add("-preset faster");
        stringJoiner.add("-crf 23");
        stringJoiner.add("-ss " + ssTime);
        stringJoiner.add("-to " + toTime);
        stringJoiner.add(path + "c" + fileName.replace("mpg", "mp4")); //mpg ve mp4'ün kırpılmış videoları .mp4 olarak dönüşecek

        String ffmpegCommand = stringJoiner.toString();
        logger.info(ffmpegCommand);
        long startTime = System.currentTimeMillis();
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
        time = new Date();
        logger.info(timeFormat.format(time));
        Process process = Runtime.getRuntime().exec(ffmpegCommand);

        new Thread(new StreamDump(process.getErrorStream()), "error stream").start();
        new Thread(new StreamDump(process.getInputStream()), "output stream").start();

        if (process.waitFor() == 0) {
            long endTime = System.currentTimeMillis();
            time = new Date();
            logger.info(timeFormat.format(time));
            while (matcher.find())
                setInfo(matcher.group() + " uzantılı videodan işlem yapıldı. Geçen süre : "+passingTime(startTime, endTime));
        }
        return process.waitFor() == 0;

    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
