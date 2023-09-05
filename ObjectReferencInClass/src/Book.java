public class Book {

    private String title;
    private Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return author.toString() + "\n" + "Title of the book " + this.title;
    }
}
