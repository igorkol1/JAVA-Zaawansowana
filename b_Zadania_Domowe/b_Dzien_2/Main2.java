package b_Zadania_Domowe.b_Dzien_2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main2 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("tree", "bird", "park", "snow", "computer", "i jeszcze jakiś inny napis, który na końcu ma a");

        Predicate<String> filterByLenght = s -> s.length() > 4;
        Predicate<String> stringWithB = s -> s.toLowerCase().contains("b");
        Predicate<String> stringFinishWithA = s -> s.toLowerCase().charAt(s.length() - 1) == 'a';

        System.out.println("a)");
        filterList(list, filterByLenght).forEach(System.out::println);

        System.out.println("b)");
        filterList(list, stringWithB).forEach(System.out::println);

        System.out.println("c)");
        filterList(list, stringFinishWithA).forEach(System.out::println);
    }

    private static List<String> filterList(List<String> list, Predicate<String> predicate) {
        return list.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

}
