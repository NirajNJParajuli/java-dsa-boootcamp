package com.niraj;

import java.awt.desktop.SystemSleepEvent;
import java.awt.image.BandedSampleModel;
import java.util.Scanner;

// QN> Write a program to print factorial of a number, also take input.
public class Factorial{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1 ;
        int fact = 1;
        System.out.print("Enter your number : ");
        int num = input.nextInt();
        for (i = 1 ; i <= num ; i++ ) {
            fact = fact * i ;
        }
        System.out.println("The factorial is " + fact);
    }
}
