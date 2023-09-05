public class Main {
    public static void main(String[] args) {
        Author author = new Author("William", "Shakespeare");
        Book book = new Book("The Merchant of Venice", author);

        System.out.println(book);
    }
}