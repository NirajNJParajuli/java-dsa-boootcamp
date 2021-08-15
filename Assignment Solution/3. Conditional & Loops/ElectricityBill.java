import java.util.Scanner;
// Calculate Electricity Bill
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter unit of electricity used : ");
        double unit = input.nextDouble();
        System.out.print("Please enter price/unit : Rs.");
        double price = input.nextDouble();

        double bill = 0;
        if (unit > 0 && price > 0 ) {
            bill = unit * price;
            System.out.println("The Electricity Bill = Rs." + bill);
        } else {
            System.out.println("Invalid Input");
        }
    }
}
