package examples;

public class Order {
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

    public void showOrderSummary(){
        System.out.println("Order code: " + code);
        System.out.println("Total amount: " + totalAmount);
        System.out.println("Customer: " + customer.getFullName());
        System.out.println("Customer city: " + customer.getAddress().getCity());
    }
}