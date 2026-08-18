import java.util.HashSet;

public class Duplicate_Strings {
    public static void main(String[] args) {

        String[] names = {
            "Apple", "Banana", "Mango", "Apple",
            "Orange", "Banana", "Grapes", "Mango"
        };

        HashSet<String> seen = new HashSet<>();
        HashSet<String> duplicates = new HashSet<>();

        for (String name : names) {
            if (!seen.add(name)) {
                duplicates.add(name);
            }
        }

        System.out.println("Duplicate Strings:");

        for (String name : duplicates) {
            System.out.println(name);
        }
    }
}