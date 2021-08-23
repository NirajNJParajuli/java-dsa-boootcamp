package com.niraj;

//QN> Write a program to print the factorial of a number by defining a method named 'Factorial'.
// Factorial of any number n is represented by n! and is equal to 123*....(n-1)n.
// E.g.- 4! = 1234 = 24 3! = 321 = 6 2! = 21 = 2 Also, 1! = 1 0! = 1

import java.util.Scanner;

public class FactorialMethod {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter the number to find the factorial = ");
        int num = inp.nextInt();
        System.out.println("The factorial of " + num + "! is " + factorial(num));
    }
    static int factorial(int num){
        int ans = 1 ;
        for (int i = 1; i <= num ; i++){
            ans = ans * i;
        }
        return ans;
    }

}
