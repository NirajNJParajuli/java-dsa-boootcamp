package com.niraj;

import java.util.Scanner;

// QN> Input a number and print all the factors of that number (use loops).
public class FactorsUsingLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the number here =>");
        int number = input.nextInt();
        System.out.print("The factors of " + number + " are : ");
        for (int a = 1; a <= number ; a++) {
            if (number % a == 0 ) {
                System.out.print(a + " ");
            }
            input.close();
        }

    }

}
