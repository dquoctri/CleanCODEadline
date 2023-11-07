package com.dqtri.clean.handbook.comments;

public class CommentedOutCode {
    public void doSomething(){
        InputStreamResponse response = new InputStreamResponse();
        response.setBody(formatter.getResultStream(), formatter.getByteCount());
        // InputStream resultsStream = formatter.getResultStream();
        // StreamReader reader = new StreamReader(resultsStream);
        // response.setContent(reader.read(formatter.getByteCount()));
    }

    public int[] doThat(){
//        this.bytePos = writeBytes(pngIdBytes, 0);
//hdrPos = bytePos;
        writeHeader();
        writeResolution();
//dataPos = bytePos;
        if (writeImageData()) {
            writeEnd();
            this.pngBytes = resizeByteArray(this.pngBytes, this.maxPos);
        }
        else {
            this.pngBytes = null;
        }
        return this.pngBytes;
    }










    int[] resizeByteArray(int[] pngBytes, int maxPos){
        return null;
    }
    int maxPos;
    int[] pngBytes;
    Formatter formatter;
    void writeHeader(){}
    void writeResolution(){}
    void writeEnd(){}
    boolean writeImageData(){return true;}
    class Formatter {
        String getResultStream(){
            return "";
        }
        String getByteCount(){
            return "";
        }
    }

    private class InputStreamResponse {
        void setBody(String s1, String s2){

        }
    }
}
