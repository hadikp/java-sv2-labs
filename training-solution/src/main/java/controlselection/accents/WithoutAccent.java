package controlselection.accents;

public class WithoutAccent {
    public void noAccent (char character) {
        if ((int) character < 200) {
            System.out.println(character);
        }
        char charToUpper = Character.toUpperCase(character);
        Accent accent = Accent.Á;
        //System.out.println(accent.getSmall());
        //System.out.println(Accent.valueOf("Á"));
        if ('Á' == charToUpper) {
            System.out.println(Accent.Á.getSmall());
        } else if ('É' == charToUpper) {
            System.out.println(Accent.É.getSmall());
        } else if ('Í' == charToUpper) {
            System.out.println(Accent.Í.getSmall());
        } else if ('Ó' == charToUpper) {
            System.out.println(Accent.Ó.getSmall());
        } else if ('Ú' == charToUpper) {
            System.out.println(Accent.Ú.getSmall());
        }
    }

    public static void main(String[] args) {
        WithoutAccent withoutAcc = new WithoutAccent();
        withoutAcc.noAccent('e');
        withoutAcc.noAccent('ó');
        withoutAcc.noAccent('á');
        withoutAcc.noAccent('í');
        withoutAcc.noAccent('ó');
    }
}
