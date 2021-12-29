package collectionslist.food;

import java.time.LocalDate;

public class Food {

    private String name;
    private LocalDate expirationTime;

    public Food(String name, LocalDate expirationTime) {
        this.name = name;
        this.expirationTime = expirationTime;
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpirationTime() {
        return expirationTime;
    }
}
