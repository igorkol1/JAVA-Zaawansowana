package a_Zadania.a_Dzien_1.b_Interfejsy;

public class Person implements Moveable {

    @Override
    public void start() {
        System.out.println("Person – człowiek idzie");
    }

    @Override
    public void stop() {
        System.out.println("Person – człowiek stoi");
    }
}
