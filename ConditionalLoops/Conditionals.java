package com.ConditionalLoops;

public class Conditionals {

    /*
    Syntax of If statements:
    if (Boolean expression True or False){
          // body - do this
    } else {
         // do this
    }
                 Example given below :
     */

    public static void main(String[] args) {
        int salary = 25000;
        if (salary < 20000) {
            salary = salary + 10343;
        } else {
            salary = salary + 12300;
            System.out.println(salary);
        }
    }

}