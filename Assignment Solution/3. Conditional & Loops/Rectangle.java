import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("length (l) = ");
        double l = in.nextDouble();
        System.out.print("breadth (b) = ");
        double b = in.nextDouble();
        double area = l * b;
        System.out.println("The area of Rectangle is " + area + "cm2");

    }
}
