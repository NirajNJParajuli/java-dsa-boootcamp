package com.niraj;

import java.util.Scanner;
// Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers :");
int a = input.nextInt();
int b = input.nextInt();
int c = input.nextInt();
        System.out.println("Maximum number is " + max(a,b,c));
        System.out.println("Minimum number is " + min(a, b, c));
        input.close();
    }
    static int max(int a , int b , int c) {
        int max = a;
        if(b > max)
            max = b;
        if (c > max)
            max = c;
        return max;
    }
    static int min(int a, int b,int c){
        int min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;
        return min;
    }
}
