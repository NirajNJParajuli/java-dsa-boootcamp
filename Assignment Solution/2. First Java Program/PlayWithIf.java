package com.niraj;
//QN> Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;

public class PlayWithIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your Operator Here =>");
        char op = input.next().trim().charAt(0);
        int ans = 0;
        if (op == '+' || op == '-' || op == '*' || op == '/') {
            System.out.print("Enter two numbers => ");
        }
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if (op == '+') {
            ans = num1 + num2 ;
        }

        if (op == '-') {
            ans = num1 - num2 ;
        }

        if (op == '*') {
            ans = num1 * num2 ;
        }

        if (op == '/') {
            if (num2 != 0) {
            ans = num1 + num2 ; }
        }
        System.out.println("Your required answer is " + ans);
    }

}
