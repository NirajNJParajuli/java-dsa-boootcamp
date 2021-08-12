package com.niraj;

public class Primitive {
    public static void main(String[] args) {
        int rollno = 14;
        // primitive data types are such which cannot be further divided into smaller data type.
        // for eg: the String "Niraj" can be break down into other smaller character or letter.
        // but the letter N cannot be further divided. so in this case "N" is a primitive datatype

        String name = "Niraj";
        char letter = 'r';
        float averageMark = 99.87f;
        double largeDecimalNumbers = 12345432.33434;
        long largeIntegerValues = 12343232L;
        boolean check = true; // or false

// now the question is hey niraj , why are you adding f in float and L in long??
        // the answer to that question is because if we donot specify float by f,it will naturally be like double and L will naturally be integer.
        // so in order to specify it is it only and becuase of memory allocation in different variables, we specify float with f and long with capital L.
// i hope that make sense.
    }
}
