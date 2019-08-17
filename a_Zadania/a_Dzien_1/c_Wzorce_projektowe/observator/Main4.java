package a_Zadania.a_Dzien_1.c_Wzorce_projektowe.observator;

public class Main4 {

    public static void main(String[] args) {
        Post post = new Post("Some title","Some content");

        post.attach(new FacebookObserver());
        post.attach(new TwitterObserver());

        post.share();

    }

}
