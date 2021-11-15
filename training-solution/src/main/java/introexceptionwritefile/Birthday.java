package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Birthday {

    private List<String> personDataList = new ArrayList<>();

    public void addData (String name ) {
        personDataList.add(name);
        System.out.println(personDataList);
    }

    public void writeFile() {
        String pathName = "C:/H/ujratervez2021/SEalapok1/java-sv2-labs/training-solution/src/main/java/introexceptionwritefile/person.txt";

        try {
            Files.write(Paths.get(pathName), personDataList);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Birthday personData = new Birthday();

        System.out.println("Írd be ismerősöd nevét és születési dátumát egy sorban vesszővel elválasztva!");
        System.out.println("Hány ismerősöd adatát szeretnéd megadni?");
        int personNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Akkor jöhetnek az " + personNumber + "ismerős adatai");

        for (int i = 1; i <=personNumber; i++) {
            String nameAndDate = sc.nextLine();
            personData.addData(nameAndDate);
        }
        personData.writeFile();

    }
}
