package introdate;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee worker = new Employee("Péter", 1971, 10, 25);
        System.out.println("Az alkalmazott neve: " + worker.getName());
        System.out.println("Az alkalmazott születési ideje: " + worker.getDateOfBirth());
        System.out.println("Az alkalmazott munkába állásának az ideje: " + worker.getBeginEmployment());
    }
}
