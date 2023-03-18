import java.util.*;

class Book {

    private int bookId;
    private String bookName;
    private String authorName;
    private int price;
    private int quantity;
    
    Random bookIdGenerator = new Random();

    List<Book> books = new ArrayList<>();
    public String getAuthorName() {
        return authorName;
    }
    public int getBookId() {
        return bookId;
    }
    public String getBookName() {
        return bookName;
    }

    public int getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    Book(){

    }

    Book(String bookName, String authorName, int price, int quantity){
        this.bookId = bookIdGenerator.nextInt(100000000);
        this.bookName= bookName;
        this.authorName= authorName;
        this.price = price;
        this.quantity=quantity;
    }

    void addBook(String bookName, String authorName, int price, int quantity){
        Book book = new Book(bookName, authorName, price, quantity);
        books.add(book);
    }

    void deleteBook(String bookName, String authorName){
        boolean found = false;
        for(int i = 0; i<books.size(); i++){
            Book book = books.get(i);
            if((book.bookName).equals(bookName) && (book.authorName).equals(authorName)){
                if(book.quantity>0){
                    int quantity = book.quantity;
                    quantity--;
                    book.quantity = quantity;
                    found = true;
                }
                if(book.quantity == 0){
                    books.remove(i);
                }
            }
        }
        if(!found){
            System.out.println("The Book " + bookName + " having author " + authorName +" is not found!");
        }
    }

    void searchBook(String bookName){
        boolean found = false;
        for(Book book : books){
            if((book.bookName).equals(bookName)){
                System.out.println("We found the book! Here are the details: " + book);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("The Book with the name " + bookName + " is Absent");
        }
    }
    void searchAuthor(String authorName){
        boolean found = false;
        for(Book book : books){
            if((book.authorName).equals(authorName)){
                System.out.println("We found the book! Here are the details: " + book);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("The Book with author " + authorName + " is Absent");
        }
    }

    void printBooks(){
        System.out.println("Printing existing books: ");
        System.out.println("-------------------------------------------------------");
        for(Book book : books){
            System.out.println(book);
        }
        System.out.println("-------------------------------------------------------");
    }

    @Override
    public String toString(){
       return this.bookId + " " + this.bookName + " " + this.authorName + " " + this.price + " " + this.quantity;
    }
}