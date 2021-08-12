package com.niraj;
//QN> Take 2 numbers as input and print the largest number.

import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Num1 =>");
        int Num1 = input.nextInt();

        System.out.print("Please Enter Num2 =>");
        int Num2 = input.nextInt();

        if (Num1 > Num2) {
            System.out.println("The Larger Number is " + Num1);
            return;
        }
        else {
            System.out.println("The Larger Number is " + Num2);
        }

    }
}
