package streamsalgorithms;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(Arrays.asList(new Employee("Péter", 1971),
                new Employee("János", 1980),
                new Employee("Márti", 1982),
                new Employee("Andi", 2001)));

        int sumYears = employees.stream()
                .mapToInt(employee -> employee.getYearOfBirth())
                .sum();
        System.out.println(sumYears);

        int sumAge = employees.stream()
                .mapToInt(employee -> employee.getYearOfBirth())
                .map(n -> 2022 - n)
                .sum();
        System.out.println(sumAge);

        long countEmployee = employees.stream()
                .count();
        System.out.println(countEmployee);

        long before1990 = employees.stream()
                .filter(employee -> employee.getYearOfBirth() < 1990)
                .count();
        System.out.println(before1990);

        int minYearOfBirth = employees.stream()
                .mapToInt(Employee::getYearOfBirth)
                .min()
                .orElseThrow(() -> new IllegalArgumentException("Empty stream"));
        System.out.println(minYearOfBirth);

        String nameMinYearOfBirth = employees.stream()
                .sorted(Comparator.comparing(Employee::getYearOfBirth))
                .map(Employee::getName) //map(employee -> employee.getName())
                .findFirst().orElseThrow(() -> new IllegalArgumentException("Empty stream"));
        System.out.println(nameMinYearOfBirth);

    }
}
