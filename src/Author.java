import java.util.Objects;

public class Author {

    private String firstName;

    private String secondName;

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public boolean equals(Object f) {
        if (this == f) return true;
        if (f == null || getClass() != f.getClass()) return false;
        Author author = (Author) f;
        return Objects.equals(firstName, author.firstName) && Objects.equals(secondName, author.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName);
    }

    @Override
    public String toString() {
        return "Author,firstName = " + firstName + ",secondName = " + secondName;

    }
}
