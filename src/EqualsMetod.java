// using object equals method

//public class EqualsMetod {
//    String name;
//    int rollno;
//    EqualsMetod(String name, int rollno) {
//        this.name = name;
//        this.rollno = rollno;
//    }
//    public static void main(String[] args) {
//        EqualsMetod e1 = new EqualsMetod("durga", 101);
//        EqualsMetod e2 = new EqualsMetod("ravi", 102);
//        EqualsMetod e3 = new EqualsMetod("durga", 101);
//        EqualsMetod e4 = e1;
//        System.out.println(e1.equals(e2));
//        System.out.println(e2.equals(e3));
//        System.out.println(e1.equals(e4));
//    }
//}


// overriding equals method for content comparision


//public class EqualsMetod {
//    String name;
//    int rollno;
//    EqualsMetod(String name, int rollno) {
//        this.name = name;
//        this.rollno = rollno;
//    }
//
//    public boolean equals(Object obj) {
//
//            String name1 = this.name;
//            int rollno1 = this.rollno;
//            EqualsMetod e = (EqualsMetod) obj;
//            String name2 = e.name;
//            int rollno2 = e.rollno;
//            if (name1.equals(name2) && rollno1 == rollno2) {
//                return true;
//            } else {
//                return false;
//            }
//
//
//    }
//
//    public static void main(String[] args) {
//        EqualsMetod e1 = new EqualsMetod("durga", 101);
//        EqualsMetod e2 = new EqualsMetod("ravi", 102);
//        EqualsMetod e3 = new EqualsMetod("durga", 101);
//        EqualsMetod e4 = e1;
//        System.out.println(e1.equals(e3));
//        System.out.println(e2.equals(e3));
//        System.out.println(e1.equals(e4));
//    }
//}



// simplified version of equals method with handling try-cath by passing different type of object & passing null argument



import java.util.concurrent.CancellationException;

//public class EqualsMetod {
//    String name;
//    int rollno;
//    EqualsMetod(String name, int rollno) {
//        this.name = name;
//        this.rollno = rollno;
//    }
//
//    public boolean equals(Object obj) {
//
//            try {
//                EqualsMetod e = (EqualsMetod) obj;
//                if (name.equals(e.name) && rollno == e.rollno) {
//                    return true;
//                } else {
//                    return false;
//                }
//            }
//            catch (ClassCastException e) {return false;}
//            catch (NullPointerException e) {return false;}
//    }
//
//    public static void main(String[] args) {
//        EqualsMetod e1 = new EqualsMetod("durga", 101);
//        EqualsMetod e2 = new EqualsMetod("ravi", 102);
//        EqualsMetod e3 = new EqualsMetod("durga", 101);
//        EqualsMetod e4 = e1;
//        System.out.println(e1.equals(e3));
//        System.out.println(e2.equals(e3));
//        System.out.println(e1.equals(e4));
//        System.out.println(e1.equals("durga"));
//        System.out.println(e1.equals(null));
//    }
//}


// more simplified version of equals method

//public class EqualsMetod {
//    String name;
//    int rollno;
//    EqualsMetod(String name, int rollno) {
//        this.name = name;
//        this.rollno = rollno;
//    }
//
//    public boolean equals(Object obj) {
//
//            if (obj == this)
//                return true;
//            if (obj instanceof EqualsMetod) {
//                EqualsMetod e = (EqualsMetod)obj;
//                if (name.equals(e.name) && rollno == e.rollno) {
//                    return true;
//                } else {
//                    return false;
//                }
//            }
//        return false;
//return false;
//    }
//
//    public static void main(String[] args) {
//        EqualsMetod e1 = new EqualsMetod("durga", 101);
//        EqualsMetod e2 = new EqualsMetod("ravi", 102);
//        EqualsMetod e3 = new EqualsMetod("durga", 101);
//        EqualsMetod e4 = e1;
//        System.out.println(e1.equals(e3));
//        System.out.println(e2.equals(e3));
//        System.out.println(e1.equals(e4));
//        System.out.println(e1.equals("durga"));
//        System.out.println(e1.equals(null));
//    }
// }


// equals() & hashCode() as overriden




import java.util.Objects;
import java.util.HashSet;

class Book {
    String isbn;
    String title;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    // ==========================================
    // 1. OVERRIDING equals()
    // ==========================================
    @Override
    public boolean equals(Object obj) {
        // Step A: Is it literally the exact same object in memory? (Performance boost)
        if (this == obj) {
            return true;
        }

        // Step B: Is the other object null, or is it completely different type of class?
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        // Step C: Cast the generic Object to our specific Book class
        Book otherBook = (Book) obj;

        // Step D: Compare the unique fields (in this case, just the ISBN)
        // We use Objects.equals() because it safely handles null values for us
        return Objects.equals(this.isbn, otherBook.isbn);
    }

    // ==========================================
    // 2. OVERRIDING hashCode()
    // ==========================================
    @Override
    public int hashCode() {
        // We MUST use the exact same fields we used in equals()
        // Objects.hash() does the complex math for us to generate a good integer ID
        return Objects.hash(this.isbn);
    }
}

public class EqualsMetod {
    public static void main(String[] args) {
        Book book1 = new Book("978-123", "Java Basics");
        Book book2 = new Book("978-123", "Java Basics"); // Same ISBN!

        // 1. Testing equals()
        System.out.println("Are book1 and book2 equal? " + book1.equals(book2));
        // Output: true (Because their ISBNs match)

        // 2. Testing hashCode()
        System.out.println("book1 HashCode: " + book1.hashCode());
        System.out.println("book2 HashCode: " + book2.hashCode());
        // Output: The numbers will be exactly the same.

        // 3. Why this matters: Using a HashSet (which relies on HashCode)
        HashSet<Book> library = new HashSet<>();
        library.add(book1);
        library.add(book2);

        // Even though we added two books, the HashSet knows they are the same book!
        System.out.println("Total unique books in library: " + library.size());
        // Output: 1
    }
}

























































