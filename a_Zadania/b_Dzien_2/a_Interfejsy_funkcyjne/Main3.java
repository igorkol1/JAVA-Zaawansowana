package a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main3 {

    public static void main(String[] args) {
        List<Integer> list = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());

        IntegerFilter integerFilter = new IntegerFilter();
        IntegerTransform integerTransform = new IntegerTransform();

        list = create(list, integerFilter, integerTransform);

        list.forEach(System.out::println);
    }

    static <T, S> List<T> create(List<S> src, Filter<S> f, Transform<T, S> t) {
        List<T> tempList = new ArrayList<>();
        for (S s : src) {
            if (f.check(s)) {
                tempList.add(t.transform(s));
            }
        }
        return tempList;
    }

}
