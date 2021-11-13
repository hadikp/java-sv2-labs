package introexceptioncheckedtrace;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class Operations {

    public List<String> readFile(String fileName) throws IOException {
        String pathName = "C:/H/ujratervez2021/SEalapok1/java-sv2-labs/training-solution/src/main/java/introexceptioncheckedtrace/" + fileName;
        List<String> metroList = Files.readAllLines(Paths.get(pathName));
        return metroList;
    }

    public void getDailySchedule(List<String> metroList) {
        LocalDate today = LocalDate.now();
        StringBuilder sc = new StringBuilder(String.valueOf(today) + ", ");

        for (String st: metroList) {
            if (st.charAt(0) == '2') {
               sc.append(st);
               sc.append(" ");
            }
        }
        System.out.println(sc);
    }


}
