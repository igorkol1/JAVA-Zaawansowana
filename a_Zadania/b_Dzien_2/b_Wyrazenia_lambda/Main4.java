package a_Zadania.b_Dzien_2.b_Wyrazenia_lambda;

import java.util.stream.IntStream;

public class Main4 {

    public static void main(String[] args) {
        NumberOperation power = (number) -> Math.pow(number, 2);
        NumberOperation root = Math::sqrt;
        NumberOperation factorial = (number) -> IntStream.rangeClosed(2, number).reduce(1, (x, y) -> x * y);

        System.out.println("2^2 = " + power.operate(2));
        System.out.println("Root of 9 = " + root.operate(9));
        System.out.println("Factorial of 10" + factorial.operate(10));
    }

}
