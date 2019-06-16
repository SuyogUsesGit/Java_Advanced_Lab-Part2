package day1.assignment7;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException() {
        super("Insufficient balance in the account");
    }
}
