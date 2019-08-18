package a_Zadania.b_Dzien_2.c_Strumienie;

import java.time.LocalDate;
import java.util.Date;

public class Employee {

    private String name;
    private String surname;
    private Gender gender;
    private LocalDate birthDate;
    private double salary;

    public Employee(String name, String surname, Gender gender, LocalDate birthDate, double salary) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    public void rise(int percentValue) {
        salary = ((percentValue / (double)100) + 1) * salary;
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthDate.getYear();
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", salary=" + salary +
                '}';
    }
}

