package exceptionclass.bank;

public class InvalidAmountBankOperationException extends InvalidBankOperationException{

    private double invalidAmount;

    public InvalidAmountBankOperationException(String message, double invalidAmount) {
        super(message);
        this.invalidAmount = invalidAmount;
    }
}
