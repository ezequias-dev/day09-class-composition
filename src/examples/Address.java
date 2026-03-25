package examples;

public class Address {
    private String street;
    private String city;
    private String state;

    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
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

    public void showAddress() {
        System.out.println("Street: " + street);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
    }
}