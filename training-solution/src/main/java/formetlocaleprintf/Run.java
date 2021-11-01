package formetlocaleprintf;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Run {
    private String name;
    private List<Double> kmList;

    public Run(String name, List<Double> kmList) {
        this.name = name;
        this.kmList = kmList;
    }

    public void addRun(double km) {
        kmList.add(km);
    }

    public void printFormattedRunText() {
        String date = LocalDate.now().toString();
        Double kmListLast = kmList.get(kmList.size() - 1);
        String text = String.format("Kedves %s! a mai dátum: %s. Ezen a héten ez a %d. futásod. Most %f km-t futottál. Csak így tovább!", name, date, kmList.size(), kmListLast);
        System.out.println(text);
    }


    public List<Double> getKmList() {
        return kmList;
    }
}
