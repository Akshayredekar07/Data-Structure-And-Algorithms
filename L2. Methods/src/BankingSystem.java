import java.util.HashMap;
import java.util.Map;

public class BankingSystem {

    private Map<String, Double> accountBalances;

    public BankingSystem() {
        this.accountBalances = new HashMap<>();
    }

    // Method to open a new account
    public void openAccount(String accountNumber, double initialBalance) {
        accountBalances.put(accountNumber, initialBalance);
        System.out.println("Account " + accountNumber + " opened with initial balance: " + initialBalance);
    }

    // Method to deposit money into an account
    public void deposit(String accountNumber, double amount) {
        if (accountBalances.containsKey(accountNumber)) {
            double currentBalance = accountBalances.get(accountNumber);
            double newBalance = currentBalance + amount;
            accountBalances.put(accountNumber, newBalance);
            System.out.println("Deposited " + amount + " into account " + accountNumber + ". New balance: " + newBalance);
        } else {
            System.out.println("Account " + accountNumber + " not found.");
        }
    }

    // Method to withdraw money from an account
    public void withdraw(String accountNumber, double amount) {
        if (accountBalances.containsKey(accountNumber)) {
            double currentBalance = accountBalances.get(accountNumber);
            if (currentBalance >= amount) {
                double newBalance = currentBalance - amount;
                accountBalances.put(accountNumber, newBalance);
                System.out.println("Withdrawn " + amount + " from account " + accountNumber + ". New balance: " + newBalance);
            } else {
                System.out.println("Insufficient funds in account " + accountNumber);
            }
        } else {
            System.out.println("Account " + accountNumber + " not found.");
        }
    }

    // Method to check the balance of an account
    public void checkBalance(String accountNumber) {
        if (accountBalances.containsKey(accountNumber)) {
            double balance = accountBalances.get(accountNumber);
            System.out.println("Balance in account " + accountNumber + ": " + balance);
        } else {
            System.out.println("Account " + accountNumber + " not found.");
        }
    }

    public static void main(String[] args) {
        BankingSystem bankingSystem = new BankingSystem();

        // Open accounts and perform transactions
        bankingSystem.openAccount("123456", 1000.0);
        bankingSystem.deposit("123456", 500.0);
        bankingSystem.withdraw("123456", 200.0);
        bankingSystem.checkBalance("123456");

        bankingSystem.openAccount("789012", 2000.0);
        bankingSystem.deposit("789012", 1000.0);
        bankingSystem.withdraw("789012", 1500.0);
        bankingSystem.checkBalance("789012");
    }
}
