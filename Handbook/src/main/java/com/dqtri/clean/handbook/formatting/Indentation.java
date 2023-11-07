package com.dqtri.clean.handbook.formatting;

import java.net.Socket;

public class Indentation {
    // @formatter:off
    public class FitNesseServer implements SocketServer { private FitNesseContext
    context; public FitNesseServer(FitNesseContext context) { this.context =
    context; } public void serve(Socket s) { serve(s, 10000); } public void
    serve(Socket s, long requestTimeout) { try { FitNesseExpediter sender = new
    FitNesseExpediter(s, context);
    sender.setRequestParsingTimeLimit(requestTimeout); sender.start(); }
    catch(Exception e) { e.printStackTrace(); } } }
    // @formatter:on

     class FitNesseServer2 implements SocketServer {
        private FitNesseContext context;

         public FitNesseServer2(FitNesseContext context) {
             this.context = context;
         }
         public void serve(Socket s) {
             serve(s, 10000);
         }
         public void serve(Socket s, long requestTimeout) {
             try {
                 FitNesseExpediter sender = new FitNesseExpediter(s, context);
                 sender.setRequestParsingTimeLimit(requestTimeout);
                 sender.start();
             }
             catch (Exception e) {
                 e.printStackTrace();
             }
         }
     }


    interface SocketServer {

    }

    class FitNesseContext {

    }

    class FitNesseExpediter{
        FitNesseExpediter(Socket s, FitNesseContext context){

        }

        void setRequestParsingTimeLimit(long requestTimeout){

        }

        void start(){

        }
    }
}
