import java.util.Scanner;
//Calculate Average Of N Numbers
public class AverageOfN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number of subjects : ");
        int subjects = input.nextInt();
        System.out.print("please enter total marks : ");
        int marks = input.nextInt();
        double avg = (double)(marks / subjects);
        System.out.println("The average is " + avg);

    }
}
