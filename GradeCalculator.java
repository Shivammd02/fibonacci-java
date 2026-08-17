import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 20): ");
            int marks = sc.nextInt();
            total += marks;
        }

        String grade;

        if (total >= 90) {
            grade = "Ex";
        } else if (total >= 80) {
            grade = "A";
        } else if (total >= 70) {
            grade = "B";
        } else if (total >= 60) {
            grade = "C";
        } else {
            grade = "F";
        }

        System.out.println("Total Marks: " + total + "/100");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}