package a_Zadania.a_Dzien_1.b_Interfejsy;

public class Car implements Moveable {

    @Override
    public void start() {
        System.out.println("Car – samochód jedzie");
    }

    @Override
    public void stop() {
        System.out.println("Car – samochód staje");
    }
}
