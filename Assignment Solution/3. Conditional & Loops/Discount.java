import java.util.Scanner;
//Calculate Discount Of Product
public class Discount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter price of the product = Rs.");
        double price = input.nextDouble();
        double discount =0;
        if (price > 2000) {
            discount = price * 0.2;
        } else if (price > 1500 || price < 2000) {
            discount = price * 0.15;
        } else {
            discount = price * 0.05;
        }
        double totalPrice = price - discount;
        System.out.println("The discount in your purchase is Rs." + discount);
        System.out.println("The total price after discount is Rs." + totalPrice);
    }
}
