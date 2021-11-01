package formetlocaleprintf;

import java.util.ArrayList;
import java.util.Arrays;

public class RunMain {
    public static void main(String[] args) {
        Run run = new Run("Péter", new ArrayList(Arrays.asList(22.3, 11.4, 23.2, 33.5)));

        run.addRun(22.4);
        run.addRun(32);
        run.printFormattedRunText();

    }

}
