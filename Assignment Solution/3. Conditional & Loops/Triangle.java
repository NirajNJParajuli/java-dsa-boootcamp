import java.util.Scanner;
//Area Of Triangle
public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("base = ");
        double base = input.nextDouble();
        System.out.print("height =");
        double height = input.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("The area of the triangle is " + area + "cm2");
    }
}
