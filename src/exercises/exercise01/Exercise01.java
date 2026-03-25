package exercises.exercise01;

class Address {
    private String street;
    private String city;
    private String state;

    public Address(String street, String city, String state) {
        if (street != null) {
            this.street = street;
        }

        if (city != null) {
            this.city = city;
        }

        if (state != null) {
            this.state = state;
        }
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
}

class Customer {
    private String fullName;
    private String email;
    private Address address;

    public Customer(String fullName, String email, Address address) {
        if (fullName != null) {
            this.fullName = fullName;
        }

        if (email != null) {
            this.email = email;
        }

        if (address != null) {
            this.address = address;
        }
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
}

public class Exercise01 {
    public static void main(String[] args) {
        Address address = new Address("Main street", "Curitiba", "PR");
        Customer customer = new Customer("Ezequias Souza", "ezequias@email.com", address);

        System.out.println("Name: " + customer.getFullName());
        System.out.println("City: " + customer.getAddress().getCity());
    }
}