class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}

public class Main {

    public static void login(String username, String password)
            throws AuthenticationException {

        String correctUsername = "David";
        String correctPassword = "Bank@123";



        if (!username.equals(correctUsername) ||
                !password.equals(correctPassword)) {
            throw new AuthenticationException(
                    "Invalid username or password."
            );
        }

        System.out.println("Login successful!");
    }

    public static void main(String[] args) {
        try {
            login("Laura", "wrong123");
        } catch (AuthenticationException e) {
            System.err.println("Authentication Error: " + e.getMessage());
        }
    }
}
