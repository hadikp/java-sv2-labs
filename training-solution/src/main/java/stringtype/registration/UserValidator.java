package stringtype.registration;

public class UserValidator {
    public String  isValidUsername(String userName) {
        if(userName.equals("")) {
            System.out.println("A felhasználónév megadása kötelező!");
        }
        return userName;

    }
}
