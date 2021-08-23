package com.niraj;

import java.util.Scanner;
//Define a method to find out if number is prime or not.
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = input.nextInt();
if(isPrime(num)){
    System.out.println("Prime");

} else {
    System.out.println("Not Prime");
}
    }
    static boolean isPrime(int num){
        boolean isPrime = true;
        for(int i = 2; i <=Math.sqrt(num); i++){
            if (num % 2 ==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

}
