package collectionsmap.trip;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassTrip {

    private Map<String, Integer> money = new HashMap<>();

    public void loadMap(Path path) {
        List<String> readFile = loadInpayments(path);
        for (String st: readFile) {
            String[] keyValue = st.split(":");
            String value = keyValue[1].trim();
            money.put(keyValue[0], Integer.parseInt(value));
        }
    }

    public List<String> loadInpayments(Path path) {
        try {
            return Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalArgumentException("Cant read file!");
        }
    }

    public Map<String, Integer> getMoney() {
        return new HashMap<>(money);
    }
}
