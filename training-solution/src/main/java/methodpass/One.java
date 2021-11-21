package methodpass;

public class One {

    public int addOne(int number) {
        return number + 1;
    }

    public static void main(String[] args) {

        int number = 5;
        System.out.println(number);
        number += 1;
        System.out.println(number);

        One one = new One();
        System.out.println(one.addOne(number));
        System.out.println(number);



    }
}
