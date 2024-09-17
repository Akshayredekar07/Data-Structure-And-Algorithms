package First;

import java.util.Scanner;

public class T22__BankingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0;

        System.out.println("Welcome to the Banking Application!");

        int choice;
        do {
            System.out.println();
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Your current balance is: " + balance);
                case 2 -> {
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Deposit successful!");
                    } else {
                        System.out.println("Invalid deposit amount!");
                    }
                }
                case 3 -> {
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful!");
                    } else {
                        System.out.println("Invalid withdrawal amount!");
                    }
                }
                case 4 -> System.out.println("Thank you for using the Banking Application!");
                default -> System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);
    }
}
