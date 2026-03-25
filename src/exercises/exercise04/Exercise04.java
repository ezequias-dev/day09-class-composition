package exercises.exercise04;

class Customer {
    private String fullName;
    private String email;

    public Customer(String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }
}

class Order {
    private String code;
    private double totalAmount;
    private Customer customer;

    public Order(String code, double totalAmount, Customer customer) {
        this.code = code;
        this.totalAmount = totalAmount;
        this.customer = customer;
    }

    public String getCode() {
        return code;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public boolean isValidOrder() {
        boolean isValidCode = code != null && !code.trim().isEmpty();
        boolean isValidTotal = totalAmount > 0;
        boolean isValidCustomer =
                customer != null &&
                customer.getFullName() != null &&
                customer.getFullName().trim().length() >= 3;

        return isValidCode && isValidTotal && isValidCustomer;
    }
}

public class Exercise04 {
    public static void main(String[] args) {
        Customer customer = new Customer("Ezequias Souza", "user@email.com");
        Order order = new Order("014", 299.90, customer);

        System.out.println("Valid order: " + order.isValidOrder());
    }
}