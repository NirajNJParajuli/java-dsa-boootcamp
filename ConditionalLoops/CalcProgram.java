package com.ConditionalLoops;
// this code is not entirely correct. i'm pushing it to github just to learn how to push files there.
import java.util.Scanner;

public class CalcProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0 ;
        while (true) {
            System.out.print("Please enter your opertor : ");
            char op = input.next().trim().charAt(0);
            if (op == '+'||op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Please enter your numbers : ");
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
                    ans = num1 / num2 ;}
                }

                if (op == '%') {
                    ans = num1 % num2 ;
                }

                else if (op == 'x') {
                    break;
                } else  {
                     System.out.println("Invalid operator !!!");
                }

                System.out.println(ans);

            }
        }
    }
}
