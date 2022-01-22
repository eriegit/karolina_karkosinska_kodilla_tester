public class Book {
    private String author;
    private String title;

    public Book() {
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public static Book of(String author, String title) {
        Book book = new Book(author, title);
        return book;
    }

    public static Book of2(String author, String title) {
        Book book = new Book();
        book.author = author + "2";
        book.title = title + "2";
        // System.out.println(b);
        return book;
    }


    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
