package methodvarargs.gps;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HikingTour {

    private List<FieldPoint> fieldPointsList = new ArrayList<>();

    public void logFieldPoints(LocalDateTime timeOfLogging, FieldPoint... fieldPointsToLog) {
        for (FieldPoint fp: fieldPointsToLog) {
            FieldPoint fpsum = new FieldPoint(fp.getTimeOfSetting(), fp.getLatitude(), fp.getLongitude());
            fpsum.setTimeOfLogging(timeOfLogging);
            fieldPointsList.add(fpsum);
        }




    }


    public List<FieldPoint> getFieldPointsList() {
        return fieldPointsList;
    }
}
