package a_Zadania.a_Dzien_1.c_Wzorce_projektowe.singleton;

import a_Zadania.a_Dzien_1.c_Wzorce_projektowe.singleton.AppConfig;

public class Main1 {

    public static void main(String[] args) {
        AppConfig appConfig1 = AppConfig.getInstance();
        appConfig1.setTestVariable("Test Value from appConfig1");

        AppConfig appConfig2 = AppConfig.getInstance();
        System.out.println(appConfig2.getTestVariable());
    }

}
