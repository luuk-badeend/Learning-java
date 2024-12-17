

public class User {
    String name;
    String pass;

    public User() {
        name = Helper.getString("Username: ");
        pass = Helper.getString("Password: ");
    }
}
