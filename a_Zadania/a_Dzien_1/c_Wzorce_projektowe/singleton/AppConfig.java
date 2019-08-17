package a_Zadania.a_Dzien_1.c_Wzorce_projektowe.singleton;

public class AppConfig {

    private static AppConfig appConfig;

    private String testVariable = "Test Value";

    public AppConfig() {
    }


    public static AppConfig getInstance() {
        if(appConfig == null) {
            appConfig = new AppConfig();
        }
        return appConfig;
    }

    public String getTestVariable() {
        return testVariable;
    }

    public void setTestVariable(String testVariable) {
        this.testVariable = testVariable;
    }
}
