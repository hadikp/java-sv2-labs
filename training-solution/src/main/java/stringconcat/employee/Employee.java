package stringconcat.employee;

public class Employee {
    private String name;
    private String job;
    private String salary;

    public Employee(String name, String job, String salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  name + " - " + job + " - " + salary + " Ft.";
    }
}
