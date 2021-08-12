package com.niraj;

import java.util.Scanner;

public class Input{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int rollno = input.nextInt();
//        System.out.println("My roll number is " + rollno);

//        String name = input.next();
//        System.out.println("My name is " + name);

//        float marks = input.nextFloat();
//        System.out.println("my average marks is " + marks);

        int a = input.nextInt();
        int b = input.nextInt();
        int sum = (a + b);

        System.out.println("The answer of a+B is Sum =" + sum);

    }

}