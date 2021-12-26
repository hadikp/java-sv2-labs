package exceptionmulticatch.aid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Aid {

    private int amount; //egy településre jutó összeg

    public Aid(int amount) {
        this.amount = amount;
    }

    public List<String> countAmountsOfAid(Path path) {
        List<String> result = new ArrayList<>();
        List<String> readF = new ArrayList<>();
        readF = readFile(path);
        for (String st: readF) {
            try {
                String[] stSplit = st.split(":");
                int dataFromFile = Integer.parseInt(stSplit[1].trim());
                String line = String.format("%s: %d", stSplit[0], amount / dataFromFile);
                result.add(line);
            }catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException aie) {
                throw new IllegalStateException("Something went wrong while counting.", aie);
            }
        }
        return result;
    }

    private List<String> readFile(Path path) {
        List<String> result = new ArrayList<>();
        try {
            result = Files.readAllLines(path);
        }
        catch (IOException | NullPointerException nse) {
            throw new IllegalStateException("Something went wrong while counting.", nse);
        }
        return result;
    }
}
