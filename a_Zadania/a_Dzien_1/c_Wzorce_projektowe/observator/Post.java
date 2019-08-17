package a_Zadania.a_Dzien_1.c_Wzorce_projektowe.observator;

import java.util.ArrayList;
import java.util.List;

public class Post implements Subject {

    private List<Observer> observers;

    private String content;
    private String title;

    public Post(String title, String content) {
        observers = new ArrayList();
        this.content = content;
        this.title = title;
    }

    public void share() {
        System.out.println("UPDATE OBSERVERS");
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(title);
        }
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
