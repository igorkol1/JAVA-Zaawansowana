package a_Zadania.b_Dzien_2.c_Strumienie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        List<Employee> employees = generateSampleData();

        System.out.println("All employees:");
        employees.stream().forEach(System.out::println);

        System.out.println("All employees with surname starts with n:");
        employees.stream()
                .filter((e) -> e.getSurname()
                        .toUpperCase()
                        .charAt(0) == 'N')
                .forEach(System.out::println);

        System.out.println("All employees wtih age between 30 and 45");
        employees.stream()
                .filter((e) -> e.getAge() > 30 && e.getAge() < 45)
                .forEach(System.out::println);

        System.out.println("Rise fo women with age between 20 and 30");
        employees.stream()
                .filter((e) -> e.getGender() == Gender.female)
                .filter((e) -> e.getAge() > 20 && e.getAge() < 30)
                .filter((e) -> e.getSalary() < 3500)
                .forEach((e) -> e.rise(5));

        System.out.println("All employees after all:");
        employees.stream().forEach(System.out::println);
    }

    private static List<Employee> generateSampleData() {
        List<Employee> generatedList = new ArrayList<>();
        generatedList.add(new Employee("Tomasz", "Kowalski", Gender.male, LocalDate.parse("1992-01-29"), 3000));
        generatedList.add(new Employee("Natalia", "Wójcik", Gender.female, LocalDate.parse("1998-04-15"), 2500));
        generatedList.add(new Employee("Karolina", "Nowak", Gender.female, LocalDate.parse("1974-05-10"), 5000));
        generatedList.add(new Employee("Kamil", "Sienkiewicz", Gender.male, LocalDate.parse("1980-01-03"), 4200));
        return generatedList;
    }
}
