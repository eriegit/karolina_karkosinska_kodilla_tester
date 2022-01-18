public class Book {

    public static Book of(String author, String title) {
        Book b = new Book();
        b.author = author;
        b.title = title;
       // System.out.println(b);
        return b;
    }

    private String author;
    private String title;

}
