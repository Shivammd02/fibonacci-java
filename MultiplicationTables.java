import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = sc.nextInt();

        System.out.print("Enter the second number: ");
        int second = sc.nextInt();

        for (int num = first; num <= second; num++) {
            System.out.println("\nMultiplication table of " + num);

            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        }

        sc.close();
    }
}