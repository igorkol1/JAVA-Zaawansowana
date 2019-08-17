package a_Zadania.a_Dzien_1.c_Wzorce_projektowe.fasada;

public class Loan {

    public void getLoan(BankAccount bankAccount,double amount){
        bankAccount.deposit(amount);
    }

}
