package a_Zadania.a_Dzien_1.c_Wzorce_projektowe.observator;

public class FacebookObserver implements Observer {
    @Override
    public void update(String title) {
        System.out.println("New post on facebook: "+title);
    }
}
