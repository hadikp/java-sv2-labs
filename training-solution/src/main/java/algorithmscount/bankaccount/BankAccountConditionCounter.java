package algorithmscount.bankaccount;

import java.util.List;

public class BankAccountConditionCounter {

    public int numberAccount (List<BankAccount> bankAccounts, int lowerBound) {
        int counter = 0;
        for (BankAccount ba : bankAccounts) {
            if (ba.getBalance() > lowerBound) {
                counter++;
            }
        }
        return counter;
    }
}
