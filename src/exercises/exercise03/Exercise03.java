package exercises.exercise03;

class AccountHolder {
    private String fullName;
    private String document;

    public AccountHolder(String fullName, String document) {
        this.fullName = fullName;
        this.document = document;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDocument() {
        return document;
    }
}

class BankAccount {
    private String accountNumber;
    private double balance;
    private AccountHolder holder;

    public BankAccount(String accountNumber, double balance, AccountHolder holder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.holder = holder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public AccountHolder getHolder() {
        return holder;
    }
}

public class Exercise03 {
    public static void main(String[] args) {
        AccountHolder holder = new AccountHolder("Ezequias Souza", "05958407789");
        BankAccount account = new BankAccount("0-15", 2180.79, holder);

        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Holder name: " + account.getHolder().getFullName());
        System.out.printf("Balance: %.2f%n", account.getBalance());
    }
}