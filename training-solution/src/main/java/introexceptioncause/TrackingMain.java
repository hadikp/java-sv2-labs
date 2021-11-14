package introexceptioncause;

import java.io.IOException;

public class TrackingMain {

    public static void main(String[] args) {
        TrackPoints trackPoints = new TrackPoints();

        try {
            trackPoints.heightPoint(trackPoints.fileReader("tracking.csv"));

        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
