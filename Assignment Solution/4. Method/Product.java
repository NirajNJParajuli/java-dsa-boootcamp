package com.niraj;

import java.util.Scanner;
//Define a method that returns the product of two numbers entered by user.
public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a = ");
        int a = in.nextInt();
        System.out.print("Please enter b = ");
        int b = in.nextInt();
        int product = product(a,b);
        System.out.println("The product of " + a + " and " + b + " is " + product);
    }
    static int product(int a, int b) {
        return a * b;
    }
}
