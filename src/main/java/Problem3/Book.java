package Problem3;
//Timothy Muresan
import java.util.UUID;

public abstract class Book implements StoreMediaOperations {
    UUID id;
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.id = UUID.randomUUID();
    }

    // copy constructor
    public Book(Book anotherBook) {
        title = anotherBook.title;
        author = anotherBook.author;
        id = anotherBook.id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Book)) {
            return false;
        }

        Book b = (Book) obj;
        return this.id == b.id && this.title == b.title && this.author == b.author;
    }
}
