package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BooksMain {
    public void booksRead () {
        List<String> booksList =  new ArrayList<>();
        String pathName = "C:/H/ujratervez2021/SEalapok1/java-sv2-labs/training-solution/src/main/java/introexceptionwritefiletestjunit5/book.txt";

        try {
            booksList = Files.readAllLines(Paths.get(pathName));
            betterList(booksList);

        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void betterList(List<String> booksList) {
        List<String> bookListFine = new ArrayList<>();
        for (String st: booksList) {
            String[] bookListSplit = st.split(";");
            String bookLFine = String.format("%s : %s", bookListSplit[2],bookListSplit[1]);
            bookListFine.add(bookLFine);
        }
        readFile(bookListFine);
    }

    public void readFile (List<String> booksListFine) {
        String pathName = "C:/H/ujratervez2021/SEalapok1/java-sv2-labs/training-solution/src/main/java/introexceptionwritefiletestjunit5/bookFine.txt";

        try {
            Files.write(Paths.get(pathName), booksListFine);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Books book = new Books();
        //book.booksRead();

    }
}
