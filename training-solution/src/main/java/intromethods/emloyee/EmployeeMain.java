package intromethods.emloyee;

public class EmployeeMain {
    public static void main(String[] args) {
        Emloyee worker = new Emloyee("Péter", 1999, 123455);
        System.out.println( worker.toString());
        System.out.println("Az alkalmazott neve: " + worker.getName());
        System.out.println("Az alkalmazott belépési éve: " + worker.getHiringYear());
        System.out.println("Az alkalmazott fizetése: " + worker.getSalary());
        int raise = 10000;
        worker.raiseSalary(10000);
        System.out.println("Az alkalmazott fiztését emeltük " + raise + " Ft-al,  ezért az új fizetése: " + worker.getSalary());

    }
}
