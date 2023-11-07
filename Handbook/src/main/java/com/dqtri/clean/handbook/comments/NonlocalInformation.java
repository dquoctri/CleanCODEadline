package com.dqtri.clean.handbook.comments;

public class NonlocalInformation {
    /**
     * Port on which fitnesse would run. Defaults to <b>8082</b>.
     *
     * @param fitnessePort
     */
    public void setFitnessePort(int fitnessePort)
    {
        this.fitnessePort = fitnessePort;
    }

    int fitnessePort;
}
