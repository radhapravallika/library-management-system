import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {
    static ArrayList<Book> books = new ArrayList<Book>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add book\n2. Display all books\n3. Search book by title\n4. Exit");
            System.out.println("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    addBook(input);
                    break;
                case 2:
                    displayAllBooks();
                    break;
                case 3:
                    searchBookByTitle(input);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void addBook(Scanner input) {
        System.out.println("Enter book title: ");
        String title = input.nextLine();
        System.out.println("Enter book author: ");
        String author = input.nextLine();
        System.out.println("Enter book publication year: ");
        int publicationYear = input.nextInt();
        input.nextLine(); // consume newline
        books.add(new Book(title, author, publicationYear));
        System.out.println("Book added successfully!");
    }

    public static void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available!");
        } else {
            System.out.println("List of all books:");
            for (int i = 0; i < books.size(); i++) {
                System.out.println((i + 1) + ". " + books.get(i));
            }
        }
    }

    public static void searchBookByTitle(Scanner input) {
        System.out.print("Enter book title to search: ");
        String title = input.nextLine();
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found:");
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Book not found!");
        }
    }
}

class Book {
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return title + " by " + author + ", published in " + publicationYear;
    }
}
