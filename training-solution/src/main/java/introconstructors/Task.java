package introconstructors;

import java.time.LocalDateTime;

public class Task {
    private String title;
    private String description;
    private LocalDateTime startDateTime;
    private int duration; //időtartam percben

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public LocalDateTime start() {
        return startDateTime = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
