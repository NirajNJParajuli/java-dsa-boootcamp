package com.niraj;

import java.util.Scanner;

// QN> Write a program to input principle, time and rate (P, T, R) from user and find Simple Interest.
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Principle Amount Here => ");
        float p = input.nextFloat();

        System.out.print("Please Enter Time Here => ");
        float t = input.nextFloat();

        System.out.print("Please Enter Rate percent Here => ");
        float r = input.nextFloat();

        float si = (p * t * r) / 100 ;
        System.out.println("The Simple Interest as per your data is " + si);
    }
}
