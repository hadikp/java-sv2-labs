package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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


        Book[] Books = {book, book2, anotherBook};
        for (Book bk: Books) {
            System.out.println(bk);
        }
        System.out.println();
        List<Book> bs = Arrays.asList(book, book2, anotherBook);
        for (Book bk: bs) {
            System.out.println(bk);
        }

        System.out.println();
        List<Book> eBook = new ArrayList<>();
        eBook.add(book);
        eBook.add(book2);
        eBook.add(anotherBook);
        for (Book bk: eBook) {
            System.out.println(bk);
        }
    }
}
