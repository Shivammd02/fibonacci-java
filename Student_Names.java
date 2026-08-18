import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Student_Names {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        System.out.print("Enter number of students (maximum 10): ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name " + (i + 1) + ": ");
            names.add(sc.nextLine());
        }

        Collections.sort(names);

        System.out.println("\nSorted Student Names:");
        for (String name : names) {
            System.out.println(name);
        }

        sc.close();
    }
}