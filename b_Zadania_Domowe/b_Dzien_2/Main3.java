package b_Zadania_Domowe.b_Dzien_2;

import java.util.function.Function;

public class Main3 {

    public static void main(String[] args) {
        String sample = "CODERSLAB";
        Function<String, String> cutText = s -> s.toLowerCase()
                .substring(2, s.length() - 2);

        System.out.println(cutText.apply(sample));
    }

}
