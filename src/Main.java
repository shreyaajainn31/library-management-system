public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.addBook("Harry Potter 1", "JK Rowling", 1000, 12);
        book.addBook("Divergent", "author", 0, 2);
        book.addBook("Twilight Saga", "Stephenie Meyer", 10, 1);
        book.printBooks();
        book.deleteBook("Divergent", "author");
        book.printBooks();
        book.deleteBook("Divergent", null);
        book.searchAuthor("author");
        book.searchAuthor("null");
        book.searchBook("Divergent");
        book.searchBook("Clearly");
    }
}
