class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}

public class DemoException {

    public static void login(String username, String password) throws AuthenticationException
    {

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
            login("David", "Bank@123");
        } catch (AuthenticationException e) {
            System.err.println("Authentication Error: " + e.getMessage());
        }
    }
}

// Handling ArithmeticException with try-cath
//class DemoException{
//    public static void main(String[] args) {
//        System.out.println("Statement1");
//        try {
//            System.out.println(10/0);
//        } catch (ArithmeticException e) {
//            System.out.println(10/2);
//            System.out.println(e.getMessage());
//        }
//        System.out.println("Statement2");
//    }
//}


//try with multiple catch block
//public class DemoException {
//
//    public static void main(String[] args) {
//
//        try {
//            int[] arr = {10, 20, 30};
//
//            int result = 10 / 0;
//
//            System.out.println(arr[5]);
//
//        } catch (ArithmeticException e) {
//            System.out.println("Cannot divide by zero");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Invalid array index");
//        } catch (Exception e) {
//            System.out.println("Some other exception occurred");
//        }
//
//        System.out.println("Program continues...");
//    }
//}
//


















