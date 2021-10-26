package compositionlist;

import java.util.Scanner;

public class BooksMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Books booksTitleAuthor = new Books();
        System.out.println("Hány könyvcímet szeretnél tárolni?");
        int db = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < db; i++) {
            System.out.println("Kérem a könyv címet!");
            String title = sc.nextLine();
            booksTitleAuthor.addBook(title);
            System.out.println("Ki a szerzője?");
            String author = sc.nextLine();
            booksTitleAuthor.addAuthor(author);
        }
        System.out.println(booksTitleAuthor); //Books attribútumai
        System.out.println("Melyik könyvet keresed? Írd ide a címét!");
        String find = sc.nextLine();
        booksTitleAuthor.findBookAndSetAuthor(find);

    }
}
