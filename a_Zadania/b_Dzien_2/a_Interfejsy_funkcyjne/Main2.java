package a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main2 {

    public static void main(String[] args) {
        List<Integer> list = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());


        IntegerFilter integerFilter = new IntegerFilter();
        IntegerTransform integerTransform = new IntegerTransform();
        printList(list,integerFilter,integerTransform);

        //printList(list,new IntegerFilter());
    }

    static <T, S> void printList(List<S> src, Filter<S> f, Transform<T, S> t) {
        for (S s : src) {
            if (f.check(s)) {
                System.out.println(t.transform(s));
            }
        }
    }
}
