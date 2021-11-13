package introexceptioncheckedtrace;

import java.io.IOException;

public class UndergroundMain {
    public static void main(String[] args) {
        Operations op = new Operations();
        try {
            op.getDailySchedule(op.readFile("underground.txt"));
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }


    }
}
