package a_Zadania.b_Dzien_2.c_Strumienie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main1 {

    public static void main(String[] args) {
        List<String> sampleList = new ArrayList<>();

        sampleList.add("Test");
        sampleList.add("Sąd");
        sampleList.add("Sampochod");
        sampleList.add("Chodnik");
        sampleList.add("Ala");
        sampleList.add("Owoce");
        sampleList.add("Pomarańcz");


        System.out.println("a)");
        sampleList.stream()
                .sorted()
                .filter((s) -> s.toLowerCase().charAt(0) == 'a'
                        || s.toLowerCase().charAt(0) == 's')
                .forEach(System.out::println);

        System.out.println("b)");

        List<String> newList = sampleList.stream()
                .filter((s) -> s.length() == 5)
                .collect(Collectors.toList());

        newList.forEach(System.out::println);

        System.out.println("c)");

        String newString = sampleList.stream()
                .map((s) -> s.substring(0, 3))
                .collect(Collectors.joining(","));

        System.out.println(newString);
    }

}
