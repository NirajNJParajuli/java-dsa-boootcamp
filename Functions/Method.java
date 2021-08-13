package com.niraj.functions;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        sum();
    }

        /*
        syntax of method/functions :
        access modifier return_type name () {
        // body
        return statement;
        }
         */

        // sum of two numbers with method/functions.

        static void sum() {
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter your first number (a)= ");
            int a = input.nextInt();
            System.out.print("Please enter your second number (b)= ");
            int b = input.nextInt();
            int c = a + b;
            System.out.println("The sum of your numbers is " + c);
        }



}
