package com.niraj;

//QN> Write a program which will ask the user to enter his/her marks (out of 100).
// Define a method that will display grades according to the marks entered as below:
// Marks Grade 91-100 AA 81-90 AB 71-80 BB 61-70 BC 51-60 CD 41-50 DD <=40 Fail

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Your grade is " + marks(num));
    }
    static String marks(int num){
        if(num > 91 && num < 101){
            return "AA";
        }
        if(num > 81 && num < 91){
            return "AB";
        }
        if(num > 71 && num < 81){
            return "BB";
        }
        if(num > 61 && num < 71){
            return "BC";
        }
        if(num > 51 && num < 61){
            return "CD";
        }
        if(num > 41 && num < 51){
            return "DD";
        }
        if (num <= 40){
            return "FAIL";
        }
        return "Error";
    }
}
