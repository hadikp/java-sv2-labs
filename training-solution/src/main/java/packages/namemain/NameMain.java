package packages.namemain;

import packages.firstname.FirstName;
import packages.lastname.LastName;
import packages.prefix.Prefix;

public class NameMain {
    public static void main(String[] args) {
        Prefix prefix = new Prefix("Dr.");
        FirstName first = new FirstName("Péter");
        LastName last = new LastName("Hadik");

        System.out.println(prefix.getPreFix() + " " + last.getLastName() + " " + first.getFirstName());
    }
}
