package composition.realestate;

public class RealEstateDotCom {
    public static void main(String[] args) {
        Address addressV = new Address("Veszprém", "8200", "Búzavirág út", 5);
        System.out.println(addressV);
        Details detailsV = new Details("A ház szép", 99, 220, addressV);
        System.out.println(detailsV);
        RealEstate realEstate = new RealEstate("Veszprémi ház eladó", 1233445, detailsV);
        System.out.println(realEstate);

        System.out.println(realEstate.getDetails().getAddress());
        System.out.println(realEstate.getDetails().getAddress().getCity());
    }
}
