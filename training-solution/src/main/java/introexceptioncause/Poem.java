package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Poem {

    public List<String> fileRead (String fileName) throws IOException {
        String pathName = "C:/H/ujratervez2021/SEalapok1/java-sv2-labs/training-solution/src/main/java/introexceptioncause/" + fileName;
        List<String> poemList = Files.readAllLines(Paths.get(pathName));
        return poemList;
    }

    public void firstLetter (List<String> poemList) {
        for (String st: poemList) {
            System.out.println(st.charAt(0));
        }
    }

    public static void main(String[] args) {
        Poem poem = new Poem();

        try {
            poem.firstLetter(poem.fileRead("poem.txt"));

        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
