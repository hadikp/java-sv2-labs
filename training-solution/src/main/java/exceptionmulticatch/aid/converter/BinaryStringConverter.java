package exceptionmulticatch.aid.converter;

public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String data) {
        isParameterNull(data);
        boolean[] arr = new boolean[data.length()];
        for (int i = 0; i < data.length(); i++) {
            isInputStringOk(data, i);
            if (data.charAt(i) == '1') {
               arr[i] = true;
           }
        }
        return arr;
    }

    private void isInputStringOk(String data, int i) {
        if (data.charAt(i) != '0' && data.charAt(i) != '1') {
            throw new IllegalArgumentException("A bemenő paraméter csak 0 és 1 lehet!");
        }
    }

    public String booleanArrayToBinaryString(boolean[] arr) {
        isParameterNull(arr);
        if (arr.length == 0) {
            throw new IllegalArgumentException("A bemeneti tömb nem lehet üres!");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == true) {
                sb.append(1);
            } else {
                sb.append(0);
            }
        }
        return sb.toString();

    }

    private void isParameterNull(boolean[] arr) {
        if (arr == null ) {
            throw new NullPointerException("Null értékű paramétert adtál meg!");
        }
    }

    private void isParameterNull(String arr) {
        if (arr == null ) {
            throw new NullPointerException("Null értékű paramétert adtál meg!");
        }
    }
}
