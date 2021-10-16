package classstructuremethods;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();

        note.setName("Péter");
        note.setTopic("Ez a címe az üzenetnek");
        note.setText("Ez pedig az üzenet része az üzenetnek");

        System.out.println(note.getNoteText());

    }
}
