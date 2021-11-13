package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Neptun {

    public List<String> readNames(String fileName) throws IOException {
        String pathName = "C:/H/ujratervez2021/SEalapok1/java-sv2-labs/training-solution/src/main/java/introexceptioncheckedtrace/" + fileName;
        return Files.readAllLines(Paths.get(pathName));
    }

    public static void main(String[] args) {
        try {
            List<String> neptunList = new Neptun().readNames("neptun.csv");
            for (String st: neptunList) {
                String[] words = st.split(",");
                String text = String.format("Név: %s, Neptun kódja: %s", words[0], words[1]);
                System.out.println(text);
            }

        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
