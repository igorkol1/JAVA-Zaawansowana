package a_Zadania.a_Dzien_1.b_Interfejsy;

public class UrlMain{

    public static void main(String[] args) {
        StandardUrl standardUrl = new StandardUrl();
        ExtendedUrl extendedUrl = new ExtendedUrl();

        System.out.println(standardUrl.getParam("param1", "url_example?param1=99&param2=string"));

        System.out.println(extendedUrl.getParam("param1","url_example/param1.55/param2.byte"));
    }

}
