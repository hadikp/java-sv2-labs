package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;
        message = message + 444;
        System.out.println(message);
        System.out.print("Az üzenet ugyanaz mint a message változóban lévő? ");
        boolean b = message.equals("Hello John Doe");
        System.out.println(b);
        System.out.print("Az üzenet ugyanaz mint a message változóban lévő? ");
        boolean c = message.equals("Hello John Doe444");
        System.out.println(c);

        String msn ="" + "";
        System.out.println("Az összekonkatenált üres karakterek hossza: " + msn.length());
        String abc = "Abcde";
        System.out.println("Az Abcde string hossza: " + abc.length());
        System.out.println("Az Abcde string hossza: " + abc.length());
        System.out.println("Az Abcde string 1. karaktere: " + abc.substring(0, 1));
        System.out.println("Az Abcde string 3. karaktere: " + abc.substring(2, 3));
        System.out.println("Az Abcde string 1-3. karaktere: " + abc.substring(0, 3));

    }
}
