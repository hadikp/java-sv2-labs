package controlselection.consonant;

public class ToConsonant {
    public void toCons (char  character) {
        switch (character) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("A következő mássalhangzó: " + (char) (character + 1));
                break;
            default:
                System.out.println("Ezt a mássalhangzót írtad be: " + character);
        }
    }

    public static void main(String[] args) {
        ToConsonant toConsonant = new ToConsonant();
        toConsonant.toCons('o');
    }
}
