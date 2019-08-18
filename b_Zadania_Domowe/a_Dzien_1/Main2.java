package b_Zadania_Domowe.a_Dzien_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Tomasz","Kowalski"));
        people.add(new Person("Kamil","Piekarzewski"));
        people.add(new Person("Natalia","Glizło"));

        Collections.sort(people);
        people.forEach(System.out::println);
    }

}
