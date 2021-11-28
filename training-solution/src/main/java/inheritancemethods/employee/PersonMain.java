package inheritancemethods.employee;

public class PersonMain {

    public static void main(String[] args) {
        Employee employee = new Employee("Péter", "Veszprém", 100_000);
        Boss boss = new Boss("Péter", "Csókakö", 100_000, 200);
        BigBoss bigBoss = new BigBoss("Péter", "Budakeszi", 100_000, 200, 100_000);

        System.out.println(employee.raiseSalary(30));
        System.out.println(boss.getSalary());
        System.out.println(bigBoss.getSalary());
    }
}
