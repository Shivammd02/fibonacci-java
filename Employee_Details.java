import java.util.Scanner;

public class Employee_Details {
    String firstName;
    String lastName;
    double monthlySalary;

    void initialize(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    void displayDetails() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Monthly Salary: " + monthlySalary);
    }

    void increaseSalary(double percentage) {
        monthlySalary = monthlySalary + (monthlySalary * percentage / 100);
    }

    double yearlySalary() {
        return monthlySalary * 12;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee_Details emp1 = new Employee_Details();
        Employee_Details emp2 = new Employee_Details();

        System.out.println("Enter details of Employee 1:");
        System.out.print("First Name: ");
        String firstName1 = sc.nextLine();

        System.out.print("Last Name: ");
        String lastName1 = sc.nextLine();

        System.out.print("Monthly Salary: ");
        double salary1 = sc.nextDouble();
        sc.nextLine();

        emp1.initialize(firstName1, lastName1, salary1);

        System.out.println("\nEnter details of Employee 2:");
        System.out.print("First Name: ");
        String firstName2 = sc.nextLine();

        System.out.print("Last Name: ");
        String lastName2 = sc.nextLine();

        System.out.print("Monthly Salary: ");
        double salary2 = sc.nextDouble();

        emp2.initialize(firstName2, lastName2, salary2);

        System.out.println("\nYearly Salary Before 10% Increase:");
        System.out.println(emp1.firstName + ": " + emp1.yearlySalary());
        System.out.println(emp2.firstName + ": " + emp2.yearlySalary());

        emp1.increaseSalary(10);
        emp2.increaseSalary(10);

        System.out.println("\nYearly Salary After 10% Increase:");
        System.out.println(emp1.firstName + ": " + emp1.yearlySalary());
        System.out.println(emp2.firstName + ": " + emp2.yearlySalary());

        sc.close();
    }
}