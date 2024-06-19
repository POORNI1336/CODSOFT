import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Corrected syntax

        System.out.println("Welcome to Currency Converter!");

        System.out.println("1. USD to Rupee");
        System.out.println("2. Rupee to USD");
        System.out.println("3. Euro to Rupee");
        System.out.println("4. Rupee to Euro");

        System.out.print("Enter your choice (1 or 2 or 3 or 4): ");
        int choice = scanner.nextInt(); // Fixed variable assignment

        switch (choice) {
            case 1:
                System.out.print("Enter the amount in USD: ");
                double usd = scanner.nextDouble();
                double rupeeFromUsd = usdToRupee(usd);
                System.out.println("Converted amount in Rupee: " + rupeeFromUsd);
                break;
            case 2:
                System.out.print("Enter the amount in Rupee: ");
                double rupee = scanner.nextDouble();
                double usdFromRupee = rupeeToUsd(rupee);
                System.out.println("Converted amount in USD: " + usdFromRupee);
                break;
            case 3:
                System.out.print("Enter the amount in Euro: ");
                double euro = scanner.nextDouble();
                double rupeeFromEuro = euroToRupee(euro);
                System.out.println("Converted amount in Rupee: " + rupeeFromEuro);
                break;
            case 4:
                System.out.print("Enter the amount in Rupee: ");
                double rupeeToEuro = scanner.nextDouble();
                double euroFromRupee = rupeeToEuro(rupeeToEuro);
                System.out.println("Converted amount in Euro: " + euroFromRupee);
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2, 3, or 4.");
                break;
        }

        scanner.close();
    }

    public static double usdToRupee(double usd) {
        return usd * 83.47; // Exchange rate as of 01/05/2024
    }

    public static double rupeeToUsd(double rupee) {
        return rupee * 0.0119884; // Exchange rate as of 01/05/2024
    }

    public static double euroToRupee(double euro) {
        return euro * 89.10; // Exchange rate as of 01/05/2024
    }

    public static double rupeeToEuro(double rupee) {
        return rupee * 0.0113; // Exchange rate as of 01/05/2024
    }
}
