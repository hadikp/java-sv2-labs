package stringtype.registration;

public class UserValidator {
    public boolean  isValidUsername(String userName) {
        if(userName.equals("")) {
            System.out.println("A felhasználónév megadása kötelező!");
            return false;
        }
        return true;
    }

    public boolean isValidPassword(String password1, String password2) {
        if(password1.length() >= 8) {
            System.out.println("A jelszó 8 karakter hosszú");
            if(password1.equals(password2)) {
                System.out.println("A két jelszó megegyezik!");
                return true;
            }else {
                System.out.println("A két jelszó nem egyezik meg!");
                return false;
            }
        }else {
            System.out.println("A jelszó nincs 8 karakter");
            return false;
        }
    }

    public boolean isValidEmail(String email) {
        boolean kukac = email.contains("@");
        boolean point = email.contains(".");
        boolean place = email.indexOf(".") - email.indexOf("@") > 1;
        boolean begin = !email.substring(0,1).equals("ß");
        boolean end = !email.substring(email.length()-1).equals(".");
        if (kukac && point && place && begin && end) {
            return true;
        } else return false;
    }
}
