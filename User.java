
import java.io.Console;
import java.security.MessageDigest;

public class User {
    public User() {
        try {

            // Create console instance
            Console console = System.console();

            if (console == null) {
                System.out.println("No console available");
                // Use return statement to exit the current method if console isn't found
                return;
            }

            // Get password from cli with readpassword method to not echo charachters while
            // typing
            // Output from console.readPassword must be saved in charachter array
            char[] passwordArray = console.readPassword("Enter password: ");

            // use String() to conver charachter array to string
            String password = new String(passwordArray);

            // Hashes password but don't understand:
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            byte[] hashedBytes = md.digest(password.getBytes());

            StringBuilder sb = new StringBuilder();

            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }

            System.out.println(sb.toString());
        } catch (Exception e) {
            throw new Error(e.getMessage());
        }
    }
}
