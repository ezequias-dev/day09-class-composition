package challenge;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private CustomerAccount customerAccount;

    public BankAccount(String accountNumber, double balance, CustomerAccount customerAccount) {
        this.accountNumber = accountNumber;
        setBalance(balance);
        this.customerAccount = customerAccount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public CustomerAccount getCustomerAccount() {
        return customerAccount;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public boolean isValidBankAccount() {
        boolean isValidAccountNumber = accountNumber != null && accountNumber.trim().length() >= 4;
        boolean isValidBalance = balance >= 0;
        boolean isValidCustomer = customerAccount != null && customerAccount.isValidCustomer();

        return isValidAccountNumber && isValidBalance && isValidCustomer;
    }

    public void showAccountSummary() {
        System.out.println();
        System.out.println("---- CUSTOMER SUMMARY ----");
        System.out.println("Name: " + getCustomerAccount().getFullName());
        System.out.println("Email: " + getCustomerAccount().getEmail());
        System.out.println("Document length: " + getCustomerAccount().getDocument().trim().length());

        System.out.println();
        System.out.println("---- ACCOUNT SUMMARY ----");
        System.out.println("Account number: " + accountNumber);
        System.out.printf("Balance: $%.2f%n", balance);
    }
}