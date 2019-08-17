package a_Zadania.a_Dzien_1.c_Wzorce_projektowe.fasada;

public class Main3 {

    public static void main(String[] args) {
        AtmApi atmApi = new AtmApi();
        atmApi.deposit(100);
        atmApi.payOut(50);
        atmApi.getLoan(1000);
        atmApi.recharge(150);
        atmApi.transfer(new BankAccount(),500);
    }

}
