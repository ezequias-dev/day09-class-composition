package challenge;

import java.util.Scanner;

public class Day09Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- CUSTOMER DATA ---");

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your document: ");
        String document = scanner.nextLine();

        System.out.println("\n--- ACCOUNT DATA ---");

        System.out.print("Enter your account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter your balance: ");
        double balance = scanner.nextDouble();

        CustomerAccount customerAccount = new CustomerAccount(fullName, email, document);
        BankAccount bankAccount = new BankAccount(accountNumber, balance, customerAccount);

        bankAccount.showAccountSummary();

        if (bankAccount.isValidBankAccount()) {
            System.out.println("Valid bank account");
        } else {
            System.out.println("Invalid bank account");
        }

        scanner.close();
    }
}
