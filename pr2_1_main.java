package com.company;

import java.util.Scanner;

public class pr2_1_main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        pr2_1_class obj1 = new pr2_1_class();
        System.out.print("Enter radius: ");
        double a = s.nextDouble();
        pr2_1_class obj2 = new pr2_1_class(a);
        System.out.println("Area & Perimeter for default radius 1 is : "+obj1.getArea()+" and "+obj1.getPerimeter());
        System.out.println("Area & Perimeter for radius " + a + " is : "+obj2.getArea()+" and "+obj2.getPerimeter());
    }
}
