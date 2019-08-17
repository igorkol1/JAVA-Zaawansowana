package a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main1 {

    public static void main(String[] args) {
        List<Integer> list = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());


        IntegerFilter integerFilter = new IntegerFilter();
        //printList(list,integerFilter);

        //printList(list,new IntegerFilter());

        printList(list, n-> n<20);
        list.stream().filter(n->n<20).forEach(System.out::println);

    }

    static <T> void printList(List<T> src, Filter<T> f) {
        for (T s : src) {
            if (f.check(s)) {
                System.out.println(s);
            }
        }
    }
}
