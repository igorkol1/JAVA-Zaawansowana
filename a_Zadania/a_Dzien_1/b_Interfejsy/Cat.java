package a_Zadania.a_Dzien_1.b_Interfejsy;

public class Cat implements Moveable {
    @Override
    public void start() {
        System.out.println("Cat – kot skacze");
    }

    @Override
    public void stop() {
        System.out.println("Cat – kot leży");
    }
}
