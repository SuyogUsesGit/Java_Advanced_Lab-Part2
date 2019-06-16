package day1.assignment8;

public class LoanTransaction implements Runnable {
    private BankFund bankFund;
    private int customerId;
    private double loanAmount;

    public LoanTransaction(BankFund bankFund, int customerId, double loanAmount) {
        this.bankFund = bankFund;
        this.customerId = customerId;
        this.loanAmount = loanAmount;
    }

    @Override
    public void run() {
        try {
            bankFund.checkFund(loanAmount);

            Thread.sleep((long)(2000*Math.random()));

            double fundsAvailable = bankFund.debitFund(loanAmount);

            System.out.println(customerId + " The loan is disbursed. Please collect the cash from the Teller" + "\n" +
                                "Funds available in bank is: " + fundsAvailable);
        }catch (InsufficientFundException e) {
            System.out.println("Sorry!!! " + customerId + " Please try some days later as we are out of funds");
        }catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
