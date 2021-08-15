import java.util.Scanner;
//Calculate Distance Between Two Points
public class Distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1 , x2 , y1, y2;
        double distance ;
        System.out.print("x1, x2 = ");
        x1 = input.nextInt();
        x2 = input.nextInt();

        System.out.print("y1, y2 = ");
         y1 = input.nextInt();
         y2 = input.nextInt();

        distance = Math.sqrt((x2-x1) * (x2 -x1 ) + (y2 - y1) * (y2 - y1));
        System.out.println("The distance between given points is " + distance + " Units");
    }
}
