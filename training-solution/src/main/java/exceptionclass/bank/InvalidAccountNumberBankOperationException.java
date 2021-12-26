package exceptionclass.bank;

public class InvalidAccountNumberBankOperationException extends InvalidBankOperationException {

    private String invalidAccountNumber;

    public InvalidAccountNumberBankOperationException(String message, String invalidAccountNumber) {
        super(message);
        this.invalidAccountNumber = invalidAccountNumber;
    }
}
