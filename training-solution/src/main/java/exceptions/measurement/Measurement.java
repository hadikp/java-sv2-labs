package exceptions.measurement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Measurement {

    public List<String> readFromFile(Path path) {
        List<String> result = new ArrayList<>();
        try {
            result = Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Nem olvasható a file!", ioe);
        }
        return result;
    }

    public List<String> validate(List<String> readFile) throws ArrayIndexOutOfBoundsException {
        List<String> mistakeResult = new ArrayList<>();
        for (String st: readFile) {
            String[] stSplit = st.split(",");
            if (isThereANumber(stSplit[0]) || isThereANumber(stSplit[1])) {
                mistakeResult.add(st);
            }
            IsArrayIndexNotCorrect(mistakeResult, st, stSplit);
            if (stSplit.length == 4) {
                mistakeResult.add(st);
            }
        }
        return mistakeResult;
    }

    private void IsArrayIndexNotCorrect(List<String> mistakeResult, String st, String[] stSplit) {
        try {
            if (isNameNotCorrect(stSplit[2])) {
                mistakeResult.add(st);
            }
        } catch (ArrayIndexOutOfBoundsException aie) {
            mistakeResult.add(st);
        }
    }

    private boolean isNameNotCorrect(String s) {
        if (!s.contains(" ")) {
            return true;
        }
        return false;
    }

    private boolean isThereANumber(String s) {
        try {
            Double.parseDouble(s);
        }
        catch (NumberFormatException nfe) {
            return true;
        }
        return false;
    }
}
