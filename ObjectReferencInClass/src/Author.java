public class Author {

    private String firstname;
    private String lastname;

    public Author(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "First name of the Author: " + this.firstname + ", Last name of the Author: " + this.lastname;
    }
}
