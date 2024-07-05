# library-management-system
The provided Java code implements a simple Library Management System that allows users to manage a collection of books. The system provides functionality to add new books, display all books, and search for books by their title. Here is a detailed description of the code:

Main Class: LibraryManagementSystem
Imports and Class Declaration:

The code imports the ArrayList and Scanner classes from the Java standard library.
The main class LibraryManagementSystem is declared as public.
Static Variables:

books: A static ArrayList<Book> that stores the collection of books in the library.
Main Method:

The main method serves as the entry point of the program.
A Scanner object input is created to read user inputs.
A while loop continuously displays a menu and handles user choices.
Menu Options:

Add Book (Option 1): Calls the addBook method to add a new book to the collection.
Display All Books (Option 2): Calls the displayAllBooks method to display all books in the collection.
Search Book by Title (Option 3): Calls the searchBookByTitle method to search for a book by its title.
Exit (Option 4): Exits the program.
An invalid choice is handled with a default case.
Method: addBook

Prompts the user to enter the title, author, and publication year of the book.
Creates a new Book object with the provided details and adds it to the books collection.
Confirms that the book has been added successfully.
Method: displayAllBooks

Checks if the books collection is empty and displays an appropriate message if no books are available.
If there are books in the collection, it iterates through the list and prints the details of each book.
Method: searchBookByTitle

Prompts the user to enter the title of the book to search.
Iterates through the books collection and checks if the title matches any book (case-insensitive).
If a match is found, it prints the details of the book.
If no match is found, it displays a "Book not found" message.
Helper Class: Book
Class Declaration:

The Book class is declared as public and includes private member variables: title, author, and publicationYear.
Constructor:

The constructor initializes the member variables with the provided values for title, author, and publication year.
Getters:

getTitle(), getAuthor(), and getPublicationYear() methods return the respective member variable values.
toString Method:

The toString method overrides the default implementation to provide a string representation of the book, including the title, author, and publication year.
Summary
This Java code provides a basic implementation of a Library Management System. It uses an ArrayList to manage a collection of books, allowing users to add, view, and search for books. The system interacts with users via the console, taking input and displaying appropriate messages based on the operations performed. The Book class serves as a blueprint for creating book objects with relevant details. This code is a good starting point for building a more comprehensive library management system with additional features such as user management, borrowing and returning books, and fine calculations.
