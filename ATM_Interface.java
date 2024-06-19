import java.util.Scanner;

public class ATM_Interface {
    public static void main(String[] args) {
        System.out.println("Welcome to the ATM!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your four-digit PIN: ");
        int enteredPin = sc.nextInt();
        Bank userAccount = new Bank(1000.0); // Changed type to Bank
        ATM atm = new ATM(userAccount);
        atm.run();
    }
}