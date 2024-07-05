package DayWiseTasks;

public class LibraryTask {
    public class Book {
        String title, author, isbn;

        public Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }
    }
    public class Library {
        Book[] books = new Book[10];
        int count = 0;

        public void addBook(Book book) {
            books[count] = book;
            count++;
        }

        public void displayBooks() {
            for (int i = 0; i < count; i++) {
                System.out.println(books[i].title + " by " + books[i].author);
            }
        }
    }

    // Main class
    public class Main {
        public void main(String[] args) {
            Library library = new Library();

            Book book1 = new Book("Book 1", "Author 1", "ISBN1");
            Book book2 = new Book("Book 2", "Author 2", "ISBN2");

            library.addBook(book1);
            library.addBook(book2);

            library.displayBooks();
        }
    }

}