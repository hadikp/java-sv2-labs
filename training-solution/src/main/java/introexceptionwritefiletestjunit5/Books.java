package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Books {

    public List<String> booksRead (Path path) {
        List<String> booksList =  new ArrayList<>();
        try {
           booksList = Files.readAllLines(path);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return booksList;
    }

    public List<String> betterList(List<String> booksList) {
        List<String> bookListFine = new ArrayList<>();
        for (String st: booksList) {
            String[] bookListSplit = st.split(";");
            String bookLFine = String.format("%s : %s", bookListSplit[2],bookListSplit[1]);
            bookListFine.add(bookLFine);
        }
        return bookListFine;
    }

    public void writeFile(Path path, List<String> booksListFine) {
        try {
           Files.write(path, booksListFine);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
