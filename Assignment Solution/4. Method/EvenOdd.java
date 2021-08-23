package com.niraj;
// Define a program to find out whether a given number is even or odd.
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
int num = input.nextInt();
evenOdd(num);
        input.close();
    }
    static void evenOdd(int num){
        if (num % 2 ==0){
            System.out.println("Even.");
        } else {
            System.out.println("Odd.");
        }
    }
}
