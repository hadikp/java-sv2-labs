package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Names {

    public List<String> readFile (String fileName) {
        String pathName = "C:/H/ujratervez2021/SEalapok1/java-sv2-labs/training-solution/src/main/java/introexceptionfinally/" + fileName;
        List<String> nameList = new ArrayList<>();
        try {
            nameList = Files.readAllLines(Paths.get(pathName));

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            System.out.println("End of reading.");
        }
        return nameList;
    }

    public void nameDr () {
        List<String> nameList = readFile("names.txt");
        for (String st: nameList) {
           if (st.startsWith("dr.")) {
               System.out.println(st);
           }
        }
    }

    public static void main(String[] args) {
        Names names = new Names();
        names.nameDr();


    }
}


