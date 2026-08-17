import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int uppercase = 0;
        int lowercase = 0;
        int digits = 0;
        int other = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                uppercase++;
            } else if (Character.isLowerCase(ch)) {
                lowercase++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                other++;
            }
        }

        System.out.println("Number of uppercase letters: " + uppercase);
        System.out.println("Number of lowercase letters: " + lowercase);
        System.out.println("Number of digits: " + digits);
        System.out.println("Number of other characters: " + other);

        sc.close();
    }
}