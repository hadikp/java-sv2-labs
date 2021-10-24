package introconstructors;

public class TaskMain {
    public static void main(String[] args) {
        Task task = new Task("Programozás", "Lecke feladatainak elkészítése");
        System.out.println("A feladat címe: " + task.getTitle());
        System.out.println("A feladat leírása: " + task.getDescription());
        System.out.println("A feladat kezdési időpontja: " + task.start());
        task.setDuration(50);
        System.out.println("A feladat időtartama: " + task.getDuration() + " perc");

    }
}
