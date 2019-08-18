package b_Zadania_Domowe.b_Dzien_2;

import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main5 {

    public static void main(String[] args) {
        List<Integer> list = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());

        System.out.println("Search test");

        Predicate<Integer> oddNumber = number -> number % 2 != 0;

        search(list, oddNumber)
                .forEach(System.out::println);

        System.out.println("Change test");

        Function<Integer, String> numberAsA = number -> {
            String temp = "";
            for (int i = 0; i < number; i++) {
                temp += 'a';
            }
            return temp;
        };

        changeCollection(list, numberAsA)
                .forEach(System.out::println);

        list.forEach(System.out::println);

        System.out.println("Consumer test");

        Consumer<Integer> addFive = number -> System.out.println(number + 5);

        consumeCollection(list, addFive);

    }

    private static <T> List<T> search(Collection<T> collection, Predicate<T> predicate) {
        return collection.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    private static <T, S> List<S> changeCollection(Collection<T> collection, Function<T, S> function) {
        return collection.stream()
                .map(function)
                .collect(Collectors.toList());
    }

    private static <T> void consumeCollection(Collection<T> collection, Consumer<T> consumer) {
        collection.stream()
                .forEach(consumer);
    }
}
