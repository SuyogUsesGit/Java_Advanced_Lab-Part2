package day1.assignment6;

import day1.assignment4.Customer;

public class WithdrawTransaction extends Security implements Runnable {
    private int transactionID;
    private Account account;
    private double amount;
    private Customer customer;

    public WithdrawTransaction(int transactionID, Account account, double amount, Customer customer) {
        this.transactionID = transactionID;
        this.account = account;
        this.amount = amount;
        this.customer = customer;
    }

    public double withdraw(Account account, double amount) throws InsufficientBalanceException {
        if(account.getBalance() >= amount) account.setBalance(account.getBalance() - amount);
        else throw new InsufficientBalanceException();
        return account.getBalance();
    }

    @Override
    public void run() {
        try {
            authorization(account, customer);
            double balance = withdraw(account, amount);
            System.out.println(transactionID + " transaction complete!!! and balance amount is " + balance);
        } catch (UnauthorizedWithdrawTransactionException e) {
            System.out.println(transactionID + " transaction failed!!! " + e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println(transactionID + " transaction failed!!! because " + e.getMessage());
        }
    }
}
