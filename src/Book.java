import java.util.Objects;

public class Book {
   private String bookName;
    private Author author;
    public int yearOfPublishing;

    public Book(String bookName,Author author,int yearOfPublishing) {
        this.bookName=bookName;
        this.author=author;
        this.yearOfPublishing=yearOfPublishing;

    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublishing == book.yearOfPublishing && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, yearOfPublishing);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author=" + author +
                ", yearOfPublishing=" + yearOfPublishing +
                '}';
    }
}

