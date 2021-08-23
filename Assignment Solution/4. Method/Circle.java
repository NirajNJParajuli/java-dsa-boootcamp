package com.niraj;

import java.util.Scanner;
//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter the radius (r) = ");
        double radius = in.nextDouble();
        System.out.println("The circumference of the circle is " + circumference(radius));
        System.out.println("The area of the circle is " + area(radius) );
    }
    static double circumference(double radius){
        return 2 * Math.PI * radius;
    }
static double area(double radius){
        return Math.PI * Math.pow(radius , 2);
}
}
