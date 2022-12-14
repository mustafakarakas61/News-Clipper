package com.mustafa.newsclipper.utils;

import java.io.InputStream;

public class StreamDump implements Runnable {
    private InputStream stream;

    public StreamDump(InputStream input) {
        this.stream = input;
    }

    public void run() {
        try {
            int c;
            while ((c = stream.read()) != -1) {
                System.out.write(c);
            }
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
