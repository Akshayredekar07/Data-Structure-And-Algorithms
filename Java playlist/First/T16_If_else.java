package First;
import java.util.Scanner;

public class T16_If_else {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer type (new/regular): ");
        String customerType = scanner.nextLine();

        System.out.print("Enter purchase amount: ");
        double purchaseAmount = scanner.nextDouble();

        double discount = 0.0;

        if (customerType.equals("new")) {
            if (purchaseAmount > 100.0) {
                discount = 0.1; // 10% discount for new customers with purchase over $100
            }
        } else if (customerType.equals("regular")) {
            if (purchaseAmount > 500.0) {
                discount = 0.2; // 20% discount for regular customers with purchase over $500
            } else if (purchaseAmount > 200.0) {
                discount = 0.1; // 10% discount for regular customers with purchase over $200
            }
        }

        double discountedAmount = purchaseAmount - (purchaseAmount * discount);
        System.out.println("Discounted Amount: $" + discountedAmount);
    }
}
