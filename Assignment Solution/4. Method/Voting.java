package com.niraj;
//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your age : ");
        int age = input.nextInt();
        if (eligible(age)) {
            System.out.println("you're eligible to vote.");

        } else{
            System.out.println("You're not eligible to vote.");
        }
    }
    static boolean eligible(int age){
        return age>=18;
    }
}
