package day1.assignment8;

public class WellsBank {
    public static void main(String[] args) {
        BankFund wellsBankFund = new BankFund(9000000);

        LoanTransaction[] loanTransactions = new LoanTransaction[100];

        for(int i=0; i<loanTransactions.length; i++) {
            loanTransactions[i] = new LoanTransaction(wellsBankFund, (1000+i), 250000);
        }

        for(int i=0; i<loanTransactions.length; i++) {
            loanTransactions[i].run();
        }

        System.out.println(wellsBankFund.getFund());
    }
}
