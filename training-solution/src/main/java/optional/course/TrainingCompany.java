package optional.course;

import java.util.List;

public class TrainingCompany {

    private List<Course> courses;

    public TrainingCompany(List<Course> courses) {
        this.courses = courses;
    }

    public Course getCheaperCourse(int maxPrice) {
        return courses.stream().filter(c -> c.getPrice() < maxPrice).findFirst()
                .orElseThrow( () -> new IllegalArgumentException("No such course."));
    }

    public int getPriceOfCourseWithGivenNameAndLevel(String name, Level level) {
        return courses.stream().filter(c -> c.getName().equals(name) && c.getLevel() == level)
                .mapToInt(Course::getPrice).findFirst().orElseThrow( () -> new IllegalArgumentException("No such course."));
    }

    public String getNameOfCourseWithGivenLevel(Level level) {
        return courses.stream().filter(c -> c.getLevel() == level).findFirst().map(s -> s.getName())
                .orElseThrow( () -> new IllegalArgumentException("Sorry, there is no course at this level."));
    }
}
