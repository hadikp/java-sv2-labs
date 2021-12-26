package exceptionclass.bank;

import java.util.List;

public class Account {

    private String accountNumber;
    private double balance;
    private double maxSubtract;

    public Account(String accountNumber, double balance) {
        isAccountEmpty(accountNumber);
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.maxSubtract = 100_000;
    }

    public void subtract(double minusMoney) {
        isOkMinusMoney(minusMoney);
        isAmountNull(minusMoney);
        balance -= minusMoney;
    }

    public void deposit(double plusMoney) {
        isAmountNull(plusMoney);
        balance += plusMoney;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }

    public void setMaxSubtract(double maxSubtract) {
        this.maxSubtract = maxSubtract;
    }

    private void isOkMinusMoney(double minusMoney) {
        if (minusMoney > maxSubtract) {
            throw new InvalidAmountBankOperationException("Nagyobb összeget adtál meg a max levonhatónál!", minusMoney);
        }
    }

    private void isAccountEmpty(String accountNumber) {
        if (accountNumber == null) {
            throw new IllegalArgumentException("A számlaszám nem lehet üres!");
        }
    }

    private void isAmountNull(double minusMoney) {
        if (minusMoney == 0) {
            throw new InvalidAmountBankOperationException("A megadott összeg nem lehet nulla!", minusMoney);
        }
    }
}
