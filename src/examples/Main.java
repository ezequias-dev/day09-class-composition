package examples;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Main street", "Salvador", "BA");
        Customer customer = new Customer("Ezequias Souza", "ezequias@email.com", address);
        Order order = new Order("ORD-1001", 350.0, customer);

        System.out.println("----");
        address.showAddress();
        System.out.println("----");
        customer.showCustomerSummary();
        System.out.println("----");
        order.showOrderSummary();
    }
}
