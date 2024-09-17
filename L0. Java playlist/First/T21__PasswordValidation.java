package First;

import java.util.Scanner;

public class T21__PasswordValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "";

        System.out.println("Password must contain at least 8 characters, including an uppercase letter," +
                " a lowercase letter, and a digit.");
        System.out.println("Please enter your password:");

        boolean isValid = false;
        while (!isValid) {
            password = scanner.nextLine();

            if (password.length() < 8) {
                System.out.println("Password must be at least 8 characters long. Please try again.");
                continue;
            }

            boolean hasUppercase = false;
            boolean hasLowercase = false;
            boolean hasDigit = false;

            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);

                if (Character.isUpperCase(ch)) {
                    hasUppercase = true;
                } else if (Character.isLowerCase(ch)) {
                    hasLowercase = true;
                } else if (Character.isDigit(ch)) {
                    hasDigit = true;
                }

                if (hasUppercase && hasLowercase && hasDigit) {
                    isValid = true;
                    break;
                }
            }

            if (!isValid) {
                System.out.println("Password must contain at least one uppercase letter," +
                        " one lowercase letter, and one digit. Please try again.");
            }
        }

        System.out.println("Password is valid!");
        System.out.println("Entered password: " + password);
    }
}
