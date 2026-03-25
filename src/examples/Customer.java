package examples;

public class Customer {
    private String fullName;
    private String email;
    private Address address;

    public Customer(String fullName, String email, Address address) {
        this.fullName = fullName;
        this.email = email;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public void showCustomerSummary() {
        System.out.println("Name: " + fullName);
        System.out.println("Email: " + email);
        System.out.println("State: " + address.getState());
    }
}