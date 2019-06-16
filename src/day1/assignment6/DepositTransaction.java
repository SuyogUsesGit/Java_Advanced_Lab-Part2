package day1.assignment6;

public class DepositTransaction extends Thread {
    private int transactionID;
    private Account account;
    private double amount;
    private int customerID;

    public DepositTransaction(int transactionID, Account account, double amount, int customerID) {
        this.transactionID = transactionID;
        this.account = account;
        this.amount = amount;
        this.customerID = customerID;
    }

    public void deposit(Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
    }

    @Override
    public void run() {
        deposit(account, amount);
        System.out.println(transactionID + " transaction completed!!! " + customerID + " Thank You for depositing to the account " + account.getAccountNumber() );
    }
}
