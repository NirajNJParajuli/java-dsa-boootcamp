package com.ConditionalLoops;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        if (n <= 0 ) {
            System.out.println("Please type positive integers");
        }
        if (n % 2 == 0) {
            System.out.println("It's an even number");
            return;
        }
        System.out.println("It's an odd number.");

    }

}
