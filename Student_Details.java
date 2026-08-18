import java.util.Scanner;

public class Student_Details {
    String studentName;
    String rollNumber;
    double totalMarks;

    void display() {
        System.out.println("\nStudent Details:");
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + totalMarks);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student_Details s = new Student_Details();

        System.out.print("Enter Student Name: ");
        s.studentName = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        s.rollNumber = sc.nextLine();

        System.out.print("Enter Total Marks: ");
        s.totalMarks = sc.nextDouble();

        s.display();

        sc.close();
    }
}