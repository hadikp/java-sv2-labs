package inheritancemethods.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void testRaiseSalary () {
        Employee employee = new Employee("Péter", "Veszprém", 100_000);
        assertEquals(100_000, employee.getSalary());
        assertEquals(130_000, employee.raiseSalary(30));
    }

}