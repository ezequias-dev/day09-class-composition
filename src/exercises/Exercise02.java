package exercises;

class Supplier {
    private String name;
    private String email;

    public Supplier(String name, String email) {
        this.name = name;
        this.email = email;

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

class Product {
    private String name;
    private double price;
    private Supplier supplier;

    public Product(String name, double price, Supplier supplier) {
        this.name = name;
        this.price = price;
        this.supplier = supplier;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Supplier getSupplier() {
        return supplier;
    }
}

public class Exercise02 {
    public static void main(String[] args) {
        Supplier supplier = new Supplier("Paulo", "paulo@email.com");
        Product product = new Product("MacBook Air", 599.9, supplier);

        System.out.println("Product name: " + product.getName());
        System.out.printf("Product price: $%.2f%n", product.getPrice());
        System.out.println("Supplier name: " + product.getSupplier().getName());
    }
}