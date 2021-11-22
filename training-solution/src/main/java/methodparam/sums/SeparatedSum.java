package methodparam.sums;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SeparatedSum {


    public SumPosNeg sum (String floatingNumbers, Path path) {
        double changeNumberD;
        double sumPositive = 0;
        double sumNegative = 0;

        floatingNumbers = fileReading(path); // fileReading segédfüggvény

        String[] numbersSplit = floatingNumbers.split(";");
        for (String st: numbersSplit) {
            String changeNumberString = st.replace(",", ".");
            changeNumberD = Double.parseDouble(changeNumberString);
            if (isNumberPoitive(changeNumberD)) { //isNumberPositive segéd
                sumPositive += changeNumberD;
            } else {
                sumNegative += changeNumberD;
            }
        }
        return new SumPosNeg(sumPositive, sumNegative);
    }

    private boolean isNumberPoitive(Double changeNumberD) {
        return changeNumberD > 0;
    }

    public String fileReading (Path path) {
        List<String> numbers = new ArrayList<>();
        try {
            numbers = Files.readAllLines(path);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return numbers.get(0);
    }
}
