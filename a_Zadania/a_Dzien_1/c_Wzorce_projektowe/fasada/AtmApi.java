package a_Zadania.a_Dzien_1.c_Wzorce_projektowe.fasada;

public class AtmApi {

    private BankAccount bankAccount;
    private Transfer transfer;
    private Loan loan;
    private PhoneCard phoneCard;

    public AtmApi() {
        this.bankAccount = new BankAccount();
        this.transfer = new Transfer();
        this.loan = new Loan();
        this.phoneCard = new PhoneCard();
    }

    public void deposit(double amount) {
        this.bankAccount.deposit(amount);
    }

    public void payOut(double amount) {
        this.bankAccount.payOut(amount);
    }

    public void transfer(BankAccount targetBankAccount, double amount) {
        this.transfer.transferMoney(bankAccount, targetBankAccount, amount);
    }

    public void getLoan(double amount) {
        this.loan.getLoan(this.bankAccount, amount);
    }

    public void recharge(double amount) {
        this.bankAccount.payOut(amount);
        this.phoneCard.recharge(amount);
    }
}
