package stringconcat.nameconcat;

public class NameMain {
    public static void main(String[] args) {
        Title mr = Title.Mr;
        Name name = new Name("Hadik", "Miklós", " Péter", mr);
        System.out.println(name.concatNameWesternStyle());
        System.out.println(name.concatNameHungarianStyle());
    }
}
