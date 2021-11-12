package introexceptionthrow.patient;

public class SsnValidator {

    public void isValidTAJ(String TAJNumber) {
        if (!isNumberOk(TAJNumber)) { //1. segédmetódus
            throw new IllegalArgumentException("A TAJ számban betű is szerepel!");
        }

        if (TAJNumber.length() == 9) {
            System.out.println("9 számjegy ok");
        }

        if (controlTaj(TAJNumber)) { //2. segédmetódus
            System.out.println("A TAJ szám jó!");
        }
    }

    public boolean isNumberOk(String TajNumber) {  //1. segédmetódus
        for (int i = 0; i < TajNumber.length(); i++) {
            if (!Character.isDigit(TajNumber.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean controlTaj(String TAJNumber) { //2. segédmetódus
        int TajSum = 0;

        for (int i = 1; i < TAJNumber.length(); i++) {
            if (i % 2 == 0) {
                TajSum += 7 * (Integer.parseInt(String.valueOf(TAJNumber.charAt(i-1))));
            } else {
                TajSum += 3 * (Integer.parseInt(String.valueOf(TAJNumber.charAt(i-1))));
            }
        }

        if ((TajSum % 10) == Integer.parseInt(String.valueOf(TAJNumber.charAt(8)))) {
           return true;
        }
        return false;
    }



}
