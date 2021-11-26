package inheritanceconstructor.tea;

public class TeaMain {

    public static void main(String[] args) {
        Tea tea = new Tea("Roibos tea", 1200);
        HerbalTea herbalTea = new HerbalTea("Herbal tea", 3000);

        System.out.println("Tea: " + tea.getName() + " Ár: " + tea.getPrice());
        System.out.println("Herbal-Tea: " + herbalTea.getName() + " Ár: " + herbalTea.getPrice());

    }
}
