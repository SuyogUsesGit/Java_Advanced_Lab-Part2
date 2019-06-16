package day1.assignment8;

public class InsufficientFundException extends Exception{
    public InsufficientFundException() {
        super("Insufficient Funds available!!!");
    }
}
