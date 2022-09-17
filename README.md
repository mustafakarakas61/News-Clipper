# FFMPEG Flagları
| Ana Ayarlar    | Örnek Kullanım     | Açıklama |
|----------------|--------------------|----------|
| -i             | `-i input.mp4`     |          |
| -y             | `-y`               |          |
| -n             | `-n`               |          |
| -loglevel      | `-loglevel `       |          |
| -v             | `-v `              |          |
| -f             | `-f concat`        |          |
| -c             | `-c copy`          |          |
| -codec         | `-codec `          |          | 
| -pre           | `-pre `            |          |
| -preset        | `-preset veryslow` |          |
| -crf           | `-crf 24`          |          |
| -t             | `-t 10`            |          |
| -to            | `-to 00:06:53`     |          |
| -ss            | `-ss 00:01:54`     |          |
| -fs            | `-fs `             |          |
| -hide_banner   | `-hide_banner `    |          |
| -stream_loop   | `-stream_loop 2`   |          | 
| -reinit_filter | `-reinit_filter `  |          |
| -discard       | `-discard `        |          |
| -disposition   | `-disposition `    |          |
| -version       | `-version `        |          |
| -encoders      | `-encoders `       |          |
| -decoders      | `-decoders `       |          |

| Video Ayarları | Örnek Kullanım        | Açıklama |
|----------------|-----------------------|----------|
| -vframes       | `-vframes `           |          |
| -r             | `-r 10`               |          |
| -fpsmax        | `-fpsmax `            |          |
| -s             | `-s `                 |          |
| -aspect        | `-aspect `            |          |
| -vn            | `-vn `                |          |
| -vcodec        | `-vcodec `            |          |
| -timecode      | `-timecode `          |          |
| -pass          | `-pass `              |          |
| -vf            | `-vf scale=1920:1080` |          |
| -ab            | `-ab 128`             |          |
| -b             | `-b:a 192k`           |          |
| -dn            | `-dn `                |          |

| Ses Ayarları | Örnek Kullanım        | Açıklama |
|--------------|-----------------------|----------|
| -aframes     | `-aframes `           |          |
| -aq          | `-aq 95k`             |          |
| -ar          | `-ar 44100`           |          |
| -ac          | `-ac 2`               |          |
| -an          | `-an mute-output.mp4` |          |
| -acodec      | `-acodec `            |          |
| -af          | `-af 'volume=0.5'`    |          |

| Altyazı Ayarları  | Örnek  Kullanım      | Açıklama |
|-------------------|----------------------|----------|
| -s                | `-s `                |          |
| -sn               | `-sn `               |          |
| -scodec           | `-scodec `           |          |
| -stag             | `-stag `             |          |
| -fix_sub_duration | `-fix_sub_duration ` |          |
| -canvas-size      | `-canvas-size `      |          |
| -spre             | `-spre `             |          |