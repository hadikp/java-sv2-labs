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
        System.out.println();

        //Logikai értékek
        boolean k = true;
        System.out.println(k);
        Boolean l = true; //autoboxing
        System.out.println(l);
        boolean m = Boolean.valueOf(true); //autounboxing
        System.out.println(m);
        Boolean n = Boolean.valueOf(true); //autoboxing
        System.out.println(n);
        boolean o = Boolean.parseBoolean("TrUe"); //autounboxing
        System.out.println(o);
        Boolean p = Boolean.parseBoolean("TrUe");
        System.out.println(p);
        boolean q = Boolean.parseBoolean("TreU"); //autounboxing
        System.out.println(o);
        Boolean r = Boolean.parseBoolean("TreU");
        System.out.println(p);
    }
}
