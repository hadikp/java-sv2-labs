package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TrackPoints {

    public List<String> fileReader  (String fileName) throws IOException {
        String pathName = "C:/H/ujratervez2021/SEalapok1/java-sv2-labs/training-solution/src/main/java/introexceptioncause/" + fileName;
        List<String> trackList = Files.readAllLines(Paths.get(pathName));
        return trackList;
    }

    public void heightPoint (List<String> trackList) {
        for (int i = 1; i < trackList.size(); i++) {
           String[] splitTrackListActual = trackList.get(i).split(";");
           String[] splitTrackListBefore = trackList.get(i-1).split(";");
           int splitTrackListActualInt = Integer.parseInt(splitTrackListActual[2]);
           int splitTrackListBeforeInt = Integer.parseInt(splitTrackListBefore[2]);
            System.out.println(splitTrackListActualInt - splitTrackListBeforeInt);
        }
    }
}
