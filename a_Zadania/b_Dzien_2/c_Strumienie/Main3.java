package a_Zadania.b_Dzien_2.c_Strumienie;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main3 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> newList = numbers.stream()
                .map(n -> n * n - 5)
                .filter(n -> n < 20)
                .collect(Collectors.toList());

        newList.forEach(System.out::println);
    }

}
