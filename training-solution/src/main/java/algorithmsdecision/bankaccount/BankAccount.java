package algorithmsdecision.bankaccount;

public class BankAccount {
    private String nameOfOwner;
    private String accountNumber;
    private int balance;


    public BankAccount(String nameOfOwner, int balance) {
        this.nameOfOwner = nameOfOwner;
        this.balance = balance;
    }

    public int withdraw (int amount) { //levétel
        return balance - amount;
    }

    public int deposit (int amount) {
        return balance + amount;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }
}
