package com.niraj;
// QN> Input currency in rupee and output in dollar.
import java.util.Scanner;

public class DollarToRupee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input, Dollar $ = ");
        double dollar = input.nextDouble();
        double rupee = dollar * 74.29;
        System.out.print("The value of $" + dollar + " in Indian Rupee is " + rupee );

    }
}
