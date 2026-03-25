package review;

import java.util.Scanner;

class UserProfile {
    private String fullName;
    private String email;
    private String password;

    public UserProfile(String fullName, String email, String password) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setFullName(String fullName) {
        if (fullName != null) {
            this.fullName = fullName;
        }
    }

    public void setEmail(String email) {
        if (email != null) {
            this.email = email;
        }
    }
    public void setPassword(String password) {
        if (password != null) {
            this.password = password;
        }
    }

    public boolean isValid() {
        boolean isValidName = fullName != null && fullName.trim().length() >= 3;
        boolean isValidEmail = email != null && email.contains("@");
        boolean isValidPassword = password != null && password.length() >= 8;

        return isValidName && isValidEmail && isValidPassword;
    }

    public void showProfileSummary() {
        System.out.println();
        System.out.println("Name: " + fullName);
        System.out.println("Email: " + email);
        System.out.println("Password length: " + (password != null ? password.length() : 0));
    }
}

public class Day08QuickReview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        UserProfile user = new UserProfile(fullName, email, password);

        user.showProfileSummary();

        if (user.isValid()) {
            System.out.println("Valid profile");
        } else {
            System.out.println("Invalid profile");
        }

        scanner.close();
    }
}