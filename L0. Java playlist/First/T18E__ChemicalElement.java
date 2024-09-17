package First;

import java.util.Scanner;

public class T18E__ChemicalElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the symbol of a chemical element: ");
        String elementSymbol = scanner.nextLine();


        switch (elementSymbol.toUpperCase()) {
            case "H":
                System.out.println("Hydrogen is the lightest and most abundant element in the universe.");
                break;
            case "O":
                System.out.println("Oxygen is a vital element for respiration and is a major component of the Earth's atmosphere.");
                break;
            case "Fe":
                System.out.println("Iron is a metal commonly used in construction and manufacturing due to its strength and durability.");
                break;
            case "C":
                System.out.println("Carbon is a versatile element that forms the basis of organic chemistry and is present in all living organisms.");
                break;
            default:
                System.out.println("Sorry, we don't have information about the chemical element you entered.");
        }



        /*
        if (elementSymbol.equalsIgnoreCase("H")) {
            System.out.println("Hydrogen is the lightest and most abundant element in the universe.");
        } else if (elementSymbol.equalsIgnoreCase("O")) {
            System.out.println("Oxygen is a vital element for respiration and is a major component of the Earth's atmosphere.");
        } else if (elementSymbol.equalsIgnoreCase("Fe")) {
            System.out.println("Iron is a metal commonly used in construction and manufacturing due to its strength and durability.");
        } else if (elementSymbol.equalsIgnoreCase("C")) {
            System.out.println("Carbon is a versatile element that forms the basis of organic chemistry and is present in all living organisms.");
        } else {
            System.out.println("Sorry, we don't have information about the chemical element you entered.");
        }
        */
    }
}
