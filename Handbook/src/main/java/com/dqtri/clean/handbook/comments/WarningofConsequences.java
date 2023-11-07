package com.dqtri.clean.handbook.comments;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class WarningofConsequences {
    // Don't run unless you
// have some time to kill.
    public void _testWithReallyBigFile(String testFile)
    {
        writeLinesToFile(10000000);
        response.setBody(testFile);
        response.readyToSend(this);
        String responseString = output.toString();
//        assertSubString("Content-Length: 1000000000", responseString);
//        assertTrue(bytesSent > 1000000000);
    }

    public static SimpleDateFormat makeStandardHttpDateFormat()
    {
//SimpleDateFormat is not thread safe,
//so we need to create each instance independently.
        SimpleDateFormat df = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z");
        df.setTimeZone(TimeZone.getTimeZone("GMT"));
        return df;
    }

    void writeLinesToFile(int noLines){
    }

    Response response;
    Output output;

    class Response {
        void setBody(String content){}
        void readyToSend(WarningofConsequences thiz){}
    }

    class Output {

    }
}
