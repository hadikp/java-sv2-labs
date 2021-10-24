package attributes.book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("És mégis mozog a Föld");
        System.out.println("A könyv alapértelmezett címe: " + book.getTitle());
        book.setTitle("A Kőszívű ember fiai");
        System.out.println("A könyv új címe: " + book.getTitle());
    }
}
