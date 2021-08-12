package com.niraj;
// QN> Take name as input and print a greeting message for that name.
import java.util.Scanner;

//QN> Take name as input and print a greeting message for that name.
public class GreetingMessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your sweet name here : ");
        String name = input.nextLine();
        System.out.println("Hi, "  + name + ", Nice to meet you. Have a good day , "  + name);
    }
}
