
//    class  BankAccount {
//
//        // Private data (Hidden)
//        private double balance;
//
//        // Constructor
//        BankAccount(double balance) {
//            this.balance = balance;
//        }
//
//        // Public method to deposit money
//        public void deposit(double amount) {
//            if (amount > 0) {
//                balance += amount;
//                System.out.println(amount + " deposited.");
//            } else {
//                System.out.println("Invalid amount.");
//            }
//        }
//
//        // Public method to withdraw money
//        public void withdraw(double amount) {
//            if (amount <= balance) {
//                balance -= amount;
//                System.out.println(amount + " withdrawn.");
//            } else {
//                System.out.println("Insufficient balance.");
//            }
//        }
//
//        // Public method to view balance
//        public double getBalance() {
//            return balance;
//        }
//    }
//
//    public class  encapsulationDemo {
//        public static void main(String[] args) {
//
//            BankAccount account = new BankAccount(5000);
//
//            account.deposit(1000);
//
//            account.withdraw(2000);
//
//            System.out.println("Balance = " + account.getBalance());
//
//
//        }
//    }




class Studentt {

    private int marks;

    public void setMarks(int marks) {

        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid Marks");
        }
    }

    public int getMarks() {
        return marks;
    }
}

public class encapsulationDemo {

    public static void main(String[] args) {

        Studentt s = new Studentt();

        s.setMarks(85);

        System.out.println(s.getMarks());

        // s.marks = 500;  // Error
    }
}









































































