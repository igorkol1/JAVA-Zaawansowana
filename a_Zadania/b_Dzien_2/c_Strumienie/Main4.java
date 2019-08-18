package a_Zadania.b_Dzien_2.c_Strumienie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main4 {

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
                .forEach(s -> System.out.println(s + " " + s.length()));

        System.out.println("b)");
        List<String> sortedList = sampleList.stream()
                .sorted()
                .collect(Collectors.toList());

        sortedList.forEach(System.out::println);


        System.out.println("c)");

        sampleList.stream()
                .filter(s -> s.toLowerCase().contains("c"))
                .forEach(System.out::println);

        System.out.println("d)");
        int sum = sampleList.stream()
                .mapToInt(String::length)
                .sum();

        System.out.println(sum);

        System.out.println("e)");
        List<String> newList2 = sampleList.stream()
                .limit(3)
                .sorted()
                .collect(Collectors.toList());

        newList2.forEach(System.out::println);
    }

}
