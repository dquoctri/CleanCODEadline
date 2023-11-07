package com.dqtri.clean.handbook.functions;

public abstract class DyadicFunctions {
    //A function with two arguments is harder to understand than a monadic function

    abstract void writeField(String name);
    abstract void writeField(String outputStream, String name);

    //Point p = new Point(0,0);
    //Point p = new Point(0);
    //However, the two arguments in this case are ordered components of a single value!


    //assertEquals(expected, actual)
    //How many times have you put the actual where the expected should be?

}
