package day1.assignment7;

public class UnauthorizedWithdrawTransactionException extends Exception {
    public UnauthorizedWithdrawTransactionException() {
        super("The user is unauthorized for the withdrawal");
    }
}
