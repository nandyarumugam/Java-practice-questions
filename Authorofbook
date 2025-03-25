import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}

class Book {
    private String title;
    private Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}

class BookImplementation {
    public List<String> firstNameOfAuthors(Author... authors) {
        return Arrays.stream(authors)
                     .map(Author::getFirstName)
                     .sorted()
                     .collect(Collectors.toList());
    }

    public List<String> titlesOf(Book... books) {
        return Arrays.stream(books)
                     .map(Book::getTitle)
                     .sorted()
                     .collect(Collectors.toList());
    }
}

public class Main {
    public static void main(String[] args) {
        Author joshuaBloch = new Author("Joshua", "Bloch");
        Author brianGoetz = new Author("Brian", "Goetz");
        Author barryBurd = new Author("Barry", "Burd");

        Book Java1 = new Book("Effective Java", joshuaBloch);
        Book Java2 = new Book("Java Concurrency In Practice", brianGoetz);
        Book Java3 = new Book("Java For Dummies", barryBurd);

        BookImplementation implementation = new BookImplementation();
        
        List<String> authorFirstNames = implementation.firstNameOfAuthors(joshuaBloch, brianGoetz, barryBurd);
        System.out.println("Sorted Author First Names: " + authorFirstNames);
        
        List<String> bookTitles = implementation.titlesOf(Java1, Java2, Java3);
        System.out.println("Sorted Book Titles: " + bookTitles);
    }
}
