package com.dqtri.clean.handbook.functions;

public abstract class ArgumentObjects {
    abstract Circle makeCircle(double x, double y, double radius);
    abstract Circle makeCircle(Point center, double radius);

    class Circle{
        Point center;
        double radius;
    }

    class Point {
        double x;
        double y;
    }
}
