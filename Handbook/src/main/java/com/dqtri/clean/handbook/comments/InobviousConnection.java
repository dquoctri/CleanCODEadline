package com.dqtri.clean.handbook.comments;

public class InobviousConnection {

    private void doSomething(){
        /*
         * start with an array that is big enough to hold all the pixels
         * (plus filter bytes), and an extra 200 bytes for header info
         */
        this.pngBytes = new byte[((this.width + 1) * this.height * 3) + 200];
    }


    byte[] pngBytes;
    int width;
    int height;
}
