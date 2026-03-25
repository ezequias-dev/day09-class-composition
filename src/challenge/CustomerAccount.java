package challenge;

public class CustomerAccount {
    private String fullName;
    private String email;
    private String document;

    public CustomerAccount(String fullName, String email, String document) {
        this.fullName = fullName;
        this.email = email;
        this.document = document;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getDocument() {
        return document;
    }

    public boolean isValidCustomer() {
        boolean isValidName = fullName != null && fullName.trim().length() >= 3;
        boolean isValidEmail = email != null && email.contains("@");
        boolean isValidDocument = document != null && document.trim().length() >= 5;

        return isValidName && isValidEmail && isValidDocument;
    }
}