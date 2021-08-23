package com.niraj;

import java.util.Scanner;
// Write a program to print the sum of two numbers entered by user by defining your own method.
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a = ");
        int a = sc.nextInt();
        System.out.print("Enter b = ");
        int b = sc.nextInt();
        int sum = sum(a,b);
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
    }
    static int sum(int a, int b){
       int sum = a + b;
        return sum;
    }
}
