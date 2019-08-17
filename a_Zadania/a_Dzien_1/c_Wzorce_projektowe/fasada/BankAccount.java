package a_Zadania.a_Dzien_1.c_Wzorce_projektowe.fasada;

public class BankAccount {

    private double balance = 0;

    public void deposit(double amount) {
        balance += amount;
    }

    public void payOut(double amount) {
        balance -= amount;
    }
}
