package classstructurecontstructors;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Asimov", "The positron man");
        book.register("2");
        System.out.println("The author of book: " + book.getAuthor());
        System.out.println("The title of book: " + book.getTitle());
        System.out.println("The registration number: " + book.getRegNumber());
    }
}
