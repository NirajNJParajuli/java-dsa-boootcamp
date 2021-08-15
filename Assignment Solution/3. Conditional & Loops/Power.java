import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        int n , p ;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number = ");
        n = input.nextInt();
        System.out.print("Please enter power = ");
        p = input.nextInt();
        int value = 1;
        System.out.print(n + " to the power of " + p + " = " );
        while (p != 0 ) {
            value = n * value ;
            p--;
        }
        System.out.print(value);
        input.close();
    }
}
