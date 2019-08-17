package a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        List<Shape> list = new ArrayList<>();
        list.add(new Rectangle(6,8,"red"));
        list.add(new Square(2,"blue"));
        list.add(new Circle(3,"black"));

        list.forEach(sharpe-> System.out.println(sharpe.toString()));
    }

}
