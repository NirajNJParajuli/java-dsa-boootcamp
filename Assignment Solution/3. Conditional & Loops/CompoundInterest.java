import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The formula for compound interest is: CI = P (1 + r/100)^(t) - 1");
        System.out.print("Principle (P) = ");
        int p= input.nextInt();
        System.out.print("Rate of Interest p.a (r) = ");
        float r = input.nextFloat();
        System.out.print("Time (t) = ");
        int t = input.nextInt();
        double R =  Math.pow(1+r/100 , t);
        double CI = p * (R) - p ;
        System.out.print("The Compound interest of entered data is " + CI);
    }
}
//Note : remember the power fn : Math.pow();