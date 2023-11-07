package com.dqtri.clean.handbook.comments;

import java.net.SocketException;

public class NoiseComments {
    ///**
    // * Default constructor.
    // */
    //protected AnnualDateRule() {
    //}
    //No, really? Or how about this:
    ///** The day of the month. */
    // private int dayOfMonth;
    //And then there’s this paragon of redundancy:
    ///**
    // * Returns the day of the month.
    // *
    // * @return the day of the month.
    // */
    //public int getDayOfMonth() {
    // return dayOfMonth;
    //}
    private void startSending() {
        try {
            doSending();
        } catch (SocketException e) {
        // normal. someone stopped the request.
        } catch (Exception e) {
            try {
                response.add(ErrorResponder.makeExceptionString(e));
                response.closeAll();
            } catch (Exception e1) {
            //Give me a break!
            }
        }
    }

    //refactored
    private void startSending2() {
        try {
            doSending();
        } catch (SocketException e) {
        // normal. someone stopped the request.
        } catch (Exception e) {
            addExceptionAndCloseResponse(e);
        }
    }

    private void addExceptionAndCloseResponse(Exception e) {
        try {
            response.add(ErrorResponder.makeExceptionString(e));
            response.closeAll();
        } catch (Exception e1) {
        }
    }


    class Response {
        void add(String message) {
        }

        void closeAll() {
        }
    }

    Response response;

    private class ErrorResponder {
        static String makeExceptionString(Exception e) {
            return "";
        }
    }

    private void doSending() throws SocketException {

    }

}
