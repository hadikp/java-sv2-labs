package objects;

public class ObjectsMain {
    public static void main(String[] args) {
        System.out.println(new Book());
        Book emptyBook  = null;
        System.out.println(emptyBook);
        Book book = new Book();
        System.out.println(book);
        book = null;
        System.out.println(book);
        Book book2 = new Book();
        book = book2;
        System.out.println(book);
        Book anotherBook = new Book();
        System.out.println(book == anotherBook);
    }
}
