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

        //1.Összegezd az alkalmazottak születési éveit!
        int sumYears = employees.stream()
                .mapToInt(employee -> employee.getYearOfBirth())
                .sum();
        System.out.println(sumYears);

        //2.Összegezd az alkalmazottak életkorát!
        int sumAge = employees.stream()
                .mapToInt(employee -> employee.getYearOfBirth())
                .map(n -> 2022 - n)
                .sum();
        System.out.println(sumAge);

        //3.Add vissza streammel, hány alkalmazott van a listában!
        long countEmployee = employees.stream()
                .count();
        System.out.println(countEmployee);

        //4.Add vissza, hány alkalmazott született 1990-nél korábban!
        long before1990 = employees.stream()
                .filter(employee -> employee.getYearOfBirth() < 1990)
                .count();
        System.out.println(before1990);

        //5.Add vissza a legkorábban született alkalmazott születési évét!
        int minYearOfBirth = employees.stream()
                .mapToInt(Employee::getYearOfBirth)
                .min()
                .orElseThrow(() -> new IllegalArgumentException("Empty stream"));
        System.out.println(minYearOfBirth);

        //6.Add vissza a legkorábban született alkalmazott nevét! (Itt szükség lesz a findFirst() záróműveletre.)
        String nameMinYearOfBirth = employees.stream()
                .sorted(Comparator.comparing(Employee::getYearOfBirth))
                .map(Employee::getName) //map(employee -> employee.getName())
                .findFirst().orElseThrow(() -> new IllegalArgumentException("Empty stream"));
        System.out.println(nameMinYearOfBirth);

        //7.Add vissza, hogy igaz-e, hogy minden alkalmazott 1980 előtt született-e?
        boolean yearOfBirthSmaller1980 = employees.stream()
                .allMatch(employee -> employee.getYearOfBirth() < 1980);
        System.out.println(yearOfBirthSmaller1980);

        //8.Add vissza egy listában az összes, 1990-nél korábban született alkalmazottat!
        List<Employee> yearOfBirthEarlier1990 = employees.stream()
                .filter(employee -> employee.getYearOfBirth() < 1990)
                .collect(Collectors.toList());
        System.out.println(yearOfBirthEarlier1990);

        List<String> yearOfBirthEarlier1990String = employees.stream()
                .filter(employee -> employee.getYearOfBirth() < 1990)
                .map(Employee::getName)
                .toList();
        System.out.println(yearOfBirthEarlier1990String);

        //9.Add vissza egy listában az összes alkalmazott nevét!
        List<String> nameAll = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(nameAll);

    }
}
