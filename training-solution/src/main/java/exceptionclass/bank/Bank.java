package exceptionclass.bank;

import java.util.List;

public class Bank {

    private List<Account> accounts;

    public Bank(List<Account> accounts) {
        accountIsEmpty(accounts);
        this.accounts = accounts;
    }

    public void balanceRise(String accountNumber, double plus) {
        int counter = 0;
        for (Account a: accounts) {
            if (a.getAccountNumber().equals(accountNumber)) {
                a.deposit(plus);
                counter++;
            }
        }
        isInvalidAccountNumber(accountNumber, counter);
    }

    public void balanceDrop(String accountNumber, double minus) {
        for (Account a: accounts) {
            if (a.getAccountNumber().equals(accountNumber)) {
                isInvalidBalanceDrop(minus, a);
                a.subtract(minus);
            }
        }
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    private void accountIsEmpty(List<Account> accounts) {
        if (accounts == null) {
            throw new IllegalArgumentException("Account lista nem lehet üres!");
        }
    }

    private void isInvalidAccountNumber(String accountNumber, int counter) {
        if (counter == 0) {
            throw new InvalidAccountNumberBankOperationException("Nincs ilyen számlaszám", accountNumber);
        }
    }

    private void isInvalidBalanceDrop(double minus, Account a) {
        if (minus > a.getBalance()) {
            throw new LowBalanceBankOperationException("Nincs elég pénz a számládon!");
        }
    }
}
