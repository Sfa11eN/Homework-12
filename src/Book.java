public class Book {
    public String bookName;
    public Author author;
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
}

