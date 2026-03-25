package exercises.exercise05;

class Department {
    private String name;
    private String location;

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}

class Employee {
    private String name;
    private double salary;
    private Department department;

    public Employee(String name, double salary, Department department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    public Department getDepartment() {
        return department;
    }
}

public class Exercise05 {
    public static void main(String[] args) {
        Department department = new Department("Software Development", "USA");
        Employee employee = new Employee("Ezequias", 12000, department);

        System.out.println("Employee name: " + employee.getName());
        System.out.printf("Employee salary: $%.2f%n", employee.getSalary());
        System.out.println("Department name: " + employee.getDepartment().getName());
        System.out.println("Department location: " + employee.getDepartment().getLocation());
    }
}