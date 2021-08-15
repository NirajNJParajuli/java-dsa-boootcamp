import java.util.Scanner;
//Area Of Circle Java Program

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter value of radius in cm = ");
        double radius = input.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println("Area = " + area + "cm2");
    }
}
