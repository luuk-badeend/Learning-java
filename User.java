
import java.io.Console;
import java.security.MessageDigest;

public class User {
    String username;
    String hashedPassword;

    public User() {
        username = Helper.getString("Enter username: ");
        hashedPassword = getHashedPassword();

        System.out.println(username + "\n" + hashedPassword);
    }

    private String getHashedPassword() {
        try {

            // Create console instance
            Console console = System.console();

            if (console == null)
                throw new Error("No console available");

            // Get password from cli with readpassword method to not echo charachters while
            // typing
            // Output from console.readPassword must be saved in charachter array
            char[] passwordArray = console.readPassword("Enter password: ");

            // use String() to convert charachter array to string
            String password = new String(passwordArray);

            // Hashes password but don't understand:
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            byte[] hashedBytes = md.digest(password.getBytes());

            StringBuilder sb = new StringBuilder();

            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }

            return sb.toString();
        } catch (Exception e) {
            throw new Error(e.getMessage());
        }
    }
}
