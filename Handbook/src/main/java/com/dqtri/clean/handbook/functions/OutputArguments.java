package com.dqtri.clean.handbook.functions;

public abstract class OutputArguments {
    abstract void appendFooter(String s);
    //Does this function append s as the footer to something? Or does it append some footer
    //to s? Is s an input or an output? It doesn’t take long to look at the function signature
    //and see:

    public abstract void appendFooter(StringBuffer report);
    //report.appendFooter();
}
