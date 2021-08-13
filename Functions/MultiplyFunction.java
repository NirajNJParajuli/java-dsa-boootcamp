package com.niraj.functions;

import java.util.Scanner;

public class MultiplyFunction {
    public static void main(String[] args) {
multiply();
    }
    static void multiply () {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number 1 :");
        int num1 = input.nextInt();
        System.out.print("please enter number 2 :");
        int num2 = input.nextInt();
        int multiply = num1 * num2;
        System.out.println(num1 + "*" + num2 + "=" + multiply);

    }
}
