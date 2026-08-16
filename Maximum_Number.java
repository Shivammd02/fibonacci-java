public class Maximum_Number {
    public static void main(String[] args) {

        int max = Integer.parseInt(args[0]);

        for (int i = 1; i < args.length; i++) {
            int number = Integer.parseInt(args[i]);

            if (number > max) {
                max = number;
            }
        }

        System.out.println("Maximum number: " + max);
    }
}
