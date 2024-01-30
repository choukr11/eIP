import java.util.Scanner;

public class Book {
    Scanner scanner = new Scanner(System.in);
    private String title;
    private String author;
    private String isbn;
    private String type;

    public Book(String title, String author,String type ) {
        this.title = title;
        this.author=author;
        this.type=type;
    }

    public String getTitle(String title) {
        this.title= title;
        return title;
    }
    public String getAuthor(String author) {
        this.author=author;
        return author;
    }
    public String getISBN(String isbn) {
        this.isbn = isbn;
        return isbn;
    }
    public String getType() {
        this.type = type;
        return type;
    }

    public void setTitle(String newTitle) {
        System.out.print("Enter new Title: ");
        newTitle =scanner.nextLine();
        title = newTitle;
        System.out.println("Title updated successfully!");
    }

    public void setAuthor(String newAuthor) {
        author = newAuthor;
        System.out.println("Author updated successfully!");
    }

    public void setIsbn(String newISBN) {
        isbn = newISBN;
        System.out.println("ISBN updated successfully!");

    }

    public void setType(String newType) {
        type = newType;
        System.out.println("Type updated successfully!");
    }

    public void bookList() {
        System.out.println("Title: " +title +"\nAuthor: " +author +"\nType: " +type +"ISBN: "+isbn);
    }
    class FictionBook extends Book {
        public FictionBook(String title, String author, String type){
            super(title, author, type);
            type="Fiction";
            System.out.println(title +"is a " +type +"book");
        }
    }
    class NonFictionBook extends Book {
        public NonFictionBook(String title, String author, String type){
            super(title, author, type);
            type="Non-fiction";
            System.out.println(title +"is a " +type +"book");

        }
    }

}
