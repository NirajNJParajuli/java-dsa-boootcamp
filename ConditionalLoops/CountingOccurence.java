package com.ConditionalLoops;

public class CountingOccurence {

    public static void main(String[] args) {
        int num = 146739474;
        int count = 0;
        while (num > 0) {
            int rem = num % 10 ;
            if (rem == 4) {
                count ++;
            }
num = num / 10;
        }
        System.out.println(count);
    }
}
