package virtualmethod.grammar;

public class Grammar {
    public static void main(String[] args) {
        Verb verb = new PhrasalVerb("látogat", "meg");
        Verb verb1 = new PhrasalVerbWithSuffix("látogat", "meg", "ják");
        System.out.println(verb.getWord());
        System.out.println(verb1.getWord());
        System.out.println();

        Preposition preposition = new PhrasalVerb("látogat", "meg");
        Preposition preposition2 = new PhrasalVerbWithSuffix("látogat", "meg", "ják");
        System.out.println(preposition.getPreposition());
        System.out.println(preposition.getWholeWord());
        System.out.println(preposition2.getPreposition());
        System.out.println(preposition2.getWholeWord());
        System.out.println();

        PhrasalVerb phrasalVerb = new PhrasalVerb("látogat", "meg");
        PhrasalVerb phrasalVerb1 =  new PhrasalVerbWithSuffix("látogat", "meg", "ják");
        System.out.println(phrasalVerb.getPreposition());
        System.out.println(phrasalVerb.getWord());
        System.out.println(phrasalVerb.getWholeWord());
        System.out.println(phrasalVerb1.getPreposition());
        System.out.println(phrasalVerb1.getWord());
        System.out.println(phrasalVerb1.getWholeWord());
        System.out.println();

        Suffix suffix = new PhrasalVerbWithSuffix("látogat", "meg", "ják");
        System.out.println(suffix.getSuffix());
        PhrasalVerbWithSuffix phrasalVerbWithSuffix = new PhrasalVerbWithSuffix("látogat", "meg", "ják");
        System.out.println(phrasalVerbWithSuffix.getPreposition());
        System.out.println(phrasalVerbWithSuffix.getWord());
        System.out.println(phrasalVerbWithSuffix.getWholeWord());
        System.out.println(phrasalVerbWithSuffix.getSuffix());

    }
}
