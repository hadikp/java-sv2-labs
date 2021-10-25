package primitivetypes;

public class PrimitiveTypesMain {
    public static void main(String[] args) {
        int a = 2;
        System.out.println(a);
        Integer b = 2; //autoboxing
        System.out.println(b);
        Integer c = a; //autoboxing
        System.out.println(c);
        Integer d = b;
        System.out.println(c);
        Integer e = Integer.valueOf(2);
        System.out.println(e);
        int f = Integer.valueOf(2); //autounboxing
        System.out.println(f);
        int g = Integer.valueOf(a);; //autounboxing
        System.out.println(g);
        int h = Integer.valueOf(c);; //autounboxing
        System.out.println(g);
        int i = Integer.parseInt("2");
        System.out.println(i);
        int j = Integer.parseInt("2");
        System.out.println(j);
    }
}
