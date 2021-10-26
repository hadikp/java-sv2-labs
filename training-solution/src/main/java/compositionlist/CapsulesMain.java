package compositionlist;

public class CapsulesMain {
    public static void main(String[] args) {
        Capsules caps = new Capsules();
        System.out.println(caps.getColors());
        caps.addfirst("green");
        System.out.println(caps.getColors());
        caps.addLast("red");
        System.out.println(caps.getColors());
        caps.addfirst("blue");
        System.out.println(caps.getColors());
        caps.addLast("white");
        System.out.println(caps.getColors());
        caps.addLast("red");
        System.out.println(caps.getColors());
        caps.addfirst("red");
        System.out.println(caps.getColors());

        caps.removeLast();
        System.out.println(caps.getColors());
        caps.removeFirst();
        System.out.println(caps.getColors());
        caps.removeFirst();
        System.out.println(caps.getColors());
        caps.removeLast();
        System.out.println(caps.getColors());
    }
}
