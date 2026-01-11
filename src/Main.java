import com.workintech.library.*;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        library.addBook(new Book("Crime And Punishment", new Author("Fyodor Dostoyevski")));
        library.addBook(new Book("Lord of the Rings", new Author("J.R.R. Tolkien")));
        Reader reader1 = new Reader("Test Reader");
        library.addReader(reader1);

        while(true) {
            System.out.println("Welcome To Library System");
            System.out.println("1. List The Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. List The Author's Books");
            System.out.println("5. Add Book");
            System.out.println("6. Remove Book");
            System.out.println("7. Show Book By Id");
            System.out.println("8. List Books By Category");
            System.out.println("9. Update Book");
            System.out.println("0. Exit");
            System.out.print("Your Choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 1:
                    System.out.println("All Books: ");
                    for (Book book : library.getBooks()) {
                        System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getStatus());
                    } break;

                case 2:
                    System.out.println("Book To Borrow: ");
                    String borrowBook = scanner.nextLine();
                    if(library.lendBook(reader1, borrowBook)) {
                        System.out.println("Book Has Been Borrowed");
                    } else {
                        System.out.println("Book Can Not Be Borrowed");
                    } break;

                case 3:
                    System.out.println("Book To Return: ");
                    String bookToReturn = scanner.nextLine();
                    if(library.returnBook(bookToReturn)) {
                        System.out.println("Book Has Been Returned");
                    } break;

                case 4:
                    System.out.println("Author's Name: ");
                    String authorName = scanner.nextLine();
                    System.out.println(authorName + "'s Books: ");
                    for (Book book : library.findBookByAuthor(authorName)) {
                        System.out.println(book.getTitle() + " " + book.getAuthor());
                    } break;

                case 5:
                    System.out.println("Book To Add ");
                    System.out.println("Title Of The Book: ");
                    String title = scanner.nextLine();
                    System.out.println("Author Of The Book");
                    String bookAuthor = scanner.nextLine();
                    Book newBook = new Book(title, new Author(bookAuthor));
                    library.addBook(newBook);
                    System.out.println("The Book Has Been Added To Library");
                    break;

                case 6:
                    System.out.println("Book To Remove");
                    System.out.println("Book Name To Delete");
                    String bookNameToDelete = scanner.nextLine();
                    if(library.removeBook(bookNameToDelete)) {
                        System.out.println("The Book Has Been Deleted");
                    } else {
                        System.out.println("The Book Could Not Be Found");
                    } break;

                case 7:
                    System.out.println("Enter Book Id: ");
                    int idToShow = scanner.nextInt();
                    scanner.nextLine();
                    Book bookToShow = library.findBookById(idToShow);
                    if(bookToShow != null) {
                        System.out.println("Book Found: " + bookToShow.getTitle() + " by " + bookToShow.getAuthor());
                    } break;

                case 8:
                    System.out.println("Enter Book Category: ");
                    String categoryToShow = scanner.nextLine();
                    System.out.println("Books in Category " + categoryToShow + ": ");
                    for (Book book : library.getBooksByCategory(Category.valueOf(categoryToShow))) {
                        System.out.println(book.getTitle() + " by " + book.getAuthor());
                    } break;

                case 9:
                    System.out.println("Enter Book Id To Update: ");
                    int idToUpdate = scanner.nextInt();
                    scanner.nextLine();
                    Book bookToUpdate = library.findBookById(idToUpdate);
                    if(bookToUpdate != null) {
                        System.out.println("Enter New Title: ");
                        String newTitle = scanner.nextLine();
                        bookToUpdate.setTitle(newTitle);
                        library.updateBook(bookToUpdate);
                        System.out.println("Book Updated");
                    } else {
                        System.out.println("Book Not Found");
                    } break;


                case 0:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice!");

            }
        }

    }
}


