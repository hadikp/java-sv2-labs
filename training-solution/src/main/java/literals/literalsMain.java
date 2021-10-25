package literals;

public class literalsMain {
    public static void main(String[] args) {
        System.out.println("" + 1 + 2);
        System.out.println(1  + "" + 2);
        System.out.println("1" + 2);

        double quotient1 = 3 / 4;
        double quotient2 = 3*1.0 / 4;
        System.out.println(quotient1);
        System.out.println(quotient2);

        System.out.println();
        long big = 3_244_444_444L;
        System.out.println(big);
        String word = "title";
        System.out.println(word.toUpperCase());
        System.out.println(Integer.toBinaryString(3)); //Integer konvertálása binárissá
        System.out.println(Integer.toBinaryString(-2)); //Kettes komplementer szerinti karakter sorozat
        System.out.println(Integer.toString(3, 2));//Int konvert bármelyik számrendszerbe


    }
}
