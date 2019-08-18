package b_Zadania_Domowe.b_Dzien_2;

public class Main1 {

    public static void main(String[] args) {
        NumberFunctionalInterface number = (i)->i>0 && i<100;

        System.out.println(number.checkNumber(-1));
        System.out.println(number.checkNumber(10));
        System.out.println(number.checkNumber(101));
    }
}
