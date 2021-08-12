package com.ConditionalLoops;

import java.util.Scanner;

public class Print1toN {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i =1;
        while ( i <= n) {
            System.out.print(i + " ");
            i += 2;
        }

    }
}
