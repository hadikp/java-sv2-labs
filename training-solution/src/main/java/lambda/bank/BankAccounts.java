package lambda.bank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BankAccounts {

    private List<BankAccount> bankAccounts;

    public BankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public List<BankAccount> orderingByBankAccount() {
        List<BankAccount> result = new ArrayList<>(bankAccounts);
        Collections.sort(result, Comparator.comparing(BankAccount::getAccountNumber));
        return result;
    }

    public List<BankAccount> orderingByBalance() {
        List<BankAccount> result = new ArrayList<>(bankAccounts);
        Comparator<BankAccount> comparator = Comparator.comparing(BankAccount::getBalance);
        result.sort(comparator.reversed());
        return result;
    }

    public List<BankAccount> orderingByNameAndBankAccount() {
        List<BankAccount> result = new ArrayList<>(bankAccounts);
        //result.sort(Comparator.nullsFirst(Comparator.comparing(BankAccount::getNameOfOwner).thenComparing(BankAccount::getAccountNumber)));
        result.sort(Comparator.nullsFirst(Comparator.comparing(BankAccount::getAccountNumber).thenComparing(BankAccount::getBalance)));
        return result;
    }
}
