import java.util.Scanner;
// Area Of Isosceles Triangle
public class Isosceles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Length of side = ");
        double side = input.nextDouble();
        System.out.print("Length of base = ");
        double base = input.nextDouble();
        double area = 0.5 * base * Math.sqrt((side * side) - (base * base)/4 );
        System.out.println("The area of an isosceles triangle is " + area + "cm2");


    }
}
