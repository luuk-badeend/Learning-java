import java.util.Scanner;

public class Helper {
    static Scanner in = new Scanner(System.in);

    public static String getString(String out) {
        while (true) {
            System.out.print(out);
            String input = in.nextLine();
            if (!input.isEmpty() && input.matches("^[a-zA-Z ]+$")) {
                return input;
            } else {
                System.out.println("Invalid input please enter a string.");
            }
        }
    }

    public static int getInt(String out) {
        while (true) {
            System.out.print(out);
            String inputString = in.nextLine();
            if (!inputString.isEmpty() && inputString.matches("^\\d+$")) {
                int inputInt = Integer.parseInt(inputString);
                return inputInt;
            } else {
                System.out.println("Invalid input please enter a integer.");
            }
        }
    }

    public static void test() {
        System.out.println(" !TEST! ");
    }
}
