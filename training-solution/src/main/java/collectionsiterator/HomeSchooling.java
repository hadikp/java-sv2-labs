package collectionsiterator;

import java.time.LocalTime;
import java.util.*;

public class HomeSchooling {

    private Map<LocalTime, String> timetable = new TreeMap<>();

    public void addMap(OnlineLesson lesson) {
        if (!timetable.containsKey(lesson.getStartLesson())) {
            timetable.put(lesson.getStartLesson(), lesson.getLessonTitle());
        }
    }

    public List<OnlineLesson> getLessonsByTitle(String title) {
        List<OnlineLesson> lessons = new ArrayList<>();
        for (Map.Entry me: timetable.entrySet()) {
            if (me.getValue().equals(title)) {
                lessons.add(new OnlineLesson((String) me.getValue(), (LocalTime) me.getKey()));
            }
        }
        return lessons;
    }

    public Map<LocalTime, String> getTimetable() {
        return new TreeMap<>(timetable);
    }
}
