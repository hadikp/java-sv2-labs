package operators;

public class OperatorsMain {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(22));
        System.out.println(Integer.toString(22, 2));

        Operators op = new Operators();
        System.out.println("A kapott szám páros: " + op.isEven(2));

        System.out.println(op.getResultOfDivision(16, 3));

        String s = "Valami";
        String s2 = null;
        System.out.println(op.isNull(s));
        System.out.println(op.isNull(s2));

        System.out.println("A paraméterként megadott string üres string, vagy null: " + op.isEmpty("tele"));


    }
}
