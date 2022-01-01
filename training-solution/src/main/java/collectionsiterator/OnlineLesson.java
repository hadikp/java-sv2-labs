package collectionsiterator;

import java.time.LocalTime;

public class OnlineLesson {

    private String lessonTitle;
    private LocalTime startLesson;

    public OnlineLesson(String lessonTitle, LocalTime startLesson) {
        this.lessonTitle = lessonTitle;
        this.startLesson = startLesson;
    }

    public String getLessonTitle() {
        return lessonTitle;
    }

    public LocalTime getStartLesson() {
        return startLesson;
    }

    @Override
    public String toString() {
        return "{" + "lessonTitle=" + lessonTitle + " startLesson=" + startLesson +
                '}';
    }
}
