package operators;

public class Operators {
    public boolean isEven(int n) {
        return (n % 2 == 0) ? true : false;
    }

    public String getResultOfDivision(int number, int divisor) {
        int egesz = Integer.valueOf(number / divisor);
        int maradek = number % divisor;
        return number + " / " + divisor + " = " + egesz + ", maradék: " + maradek;
    }

    public String isNull(String s) {
        return s == null ? "null értékű" : "nem null értékű";
    }

    public boolean isEmpty(String s) {
        return  s == null || s.equals("");
    }

}
