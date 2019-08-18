package a_Zadania.b_Dzien_2.b_Wyrazenia_lambda;

import java.util.function.Predicate;

public class Main2 {

    public static void main(String[] args) {

        Predicate predicate = (o)-> {
            boolean correctType = o instanceof String;
            if(correctType){
                System.out.println(o);
            }
            return correctType;
        };

        predicate.test("Test");
        predicate.test(1);
        predicate.test(new int[]{1,2,4});
    }

}

