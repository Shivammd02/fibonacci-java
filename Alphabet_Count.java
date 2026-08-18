import java.util.Scanner;

public class Alphabet_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch >= 'a' && ch <= 'z') {
                count[ch - 'a']++;
            }
        }

        System.out.println("\nAlphabet Occurrences:");

        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                System.out.println((char)('A' + i) + " : " + count[i]);
            }
        }

        sc.close();
    }
}