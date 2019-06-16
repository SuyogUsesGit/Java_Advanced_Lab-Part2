package day1.assignment6;

public class UnauthorizedWithdrawTransactionException extends Exception {
    public UnauthorizedWithdrawTransactionException() {
        super("The user is unauthorized for the withdrawal");
    }
}
