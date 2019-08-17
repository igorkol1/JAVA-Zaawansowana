package a_Zadania.a_Dzien_1.c_Wzorce_projektowe.observator;

public class TwitterObserver implements Observer {
    @Override
    public void update(String title) {
        System.out.println("New post on twitter: "+title);
    }
}
