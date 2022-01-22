public class BookMain {
    public static void main(String[] args) {
        Book book = Book.of("Isaac Asimov", "The Galaxy");
        System.out.println(book);

        Book book2 = Book.of2("J.R.R. Tolkien", "Lord of the Rings");
        System.out.println(book2);

        Book book3 = new Book("test a", "test t");
        System.out.println(book3);
    }
}
