package com.dqtri.clean.handbook.formatting;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class HorizontalAlignment {
    // @formatter:off
    //started coding in C, C++
    class FitNesseExpediter implements ResponseSender
    {
        private Socket          socket;
        private InputStream     input;
        private OutputStream    output;
        private Request         request;
        private Response        response;
        private FitNesseContext context;
        protected long    requestParsingTimeLimit;
        private   long    requestProgress;
        private   long    requestParsingDeadline;
        private   boolean hasError;
        public FitNesseExpediter(Socket s, FitNesseContext context) throws Exception
        {
            this.context =            context;
            socket =                  s;
            input =                   s.getInputStream();
            output =                  s.getOutputStream();
            requestParsingTimeLimit = 10000;
        }
    }
    // @formatter:on

    class FitNesseExpediter2 implements ResponseSender {
        private Socket socket;
        private InputStream input;
        private OutputStream output;
        private Request request;
        private Response response;
        private FitNesseContext context;
        protected long requestParsingTimeLimit;
        private long requestProgress;
        private long requestParsingDeadline;
        private boolean hasError;

        public FitNesseExpediter2(Socket s, FitNesseContext context) throws Exception {
            this.context = context;
            socket = s;
            input = s.getInputStream();
            output = s.getOutputStream();
            requestParsingTimeLimit = 10000;
        }
    }

    interface ResponseSender {

    }

    class FitNesseContext {

    }

}
