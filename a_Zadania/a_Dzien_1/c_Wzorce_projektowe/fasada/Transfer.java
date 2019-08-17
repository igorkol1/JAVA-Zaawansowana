package a_Zadania.a_Dzien_1.c_Wzorce_projektowe.fasada;

public class Transfer {

    public void transferMoney(BankAccount bankAccount1,BankAccount bankAccount2,double amount){
        bankAccount1.payOut(amount);
        bankAccount2.deposit(amount);
    }

}
