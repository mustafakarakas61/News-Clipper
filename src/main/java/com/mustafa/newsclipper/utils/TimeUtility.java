package com.mustafa.newsclipper.utils;

public class TimeUtility {

    public static String passingTime(long startTime, long endTime){
        String hours, nMinutes = null, nSeconds;
        int seconds, minutes;
        int result = (int) (endTime - startTime);
        seconds = result / 1000;

        if (seconds > 60) {
            nSeconds = String.valueOf(seconds % 60);
            minutes = seconds - Integer.parseInt(nSeconds);
            if (minutes > 60) {
                nMinutes = String.valueOf((minutes / 60) % 60);
                hours = String.valueOf((((minutes / 60) - Integer.parseInt(nMinutes)) / 60));
            } else {
                hours = "00";
            }
        } else {
            nSeconds = String.valueOf(seconds);
            nMinutes = "00";
            hours = "00";
        }
        if (!(hours == null) && hours.length() == 1)
            hours = "0" + hours;
        if (!(nMinutes == null) && nMinutes.length() == 1)
            nMinutes = "0" + nMinutes;
        if (!(nSeconds == null) && nSeconds.length() == 1)
            nSeconds = "0" + nSeconds;

        String time = hours + ":" + nMinutes + ":" + nSeconds;
        return time;
    }
}
