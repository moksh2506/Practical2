package com.company;

public class pr2_1_class {
    private double r;

    public pr2_1_class()
    {
        r = 1;
    }

    public pr2_1_class(double radius)
    {
        this.r = radius;
    }

    public double getArea()
    {
        return 22 * r * r / 7;
    }

    public double getPerimeter()
    {
        return 2 * 22 * r / 7;

    }
}
