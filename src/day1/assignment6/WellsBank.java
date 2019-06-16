package day1.assignment6;

import day1.assignment4.Customer;

public class WellsBank {
    public static void main(String[] args) {
        Customer first = new Customer(1001, "Raj");
        Account firstAccount = new Account(2001, first, 20000);

        Customer second = new Customer(1001, "Raj");
        Account secondAccount = new Account(2001, second, 20000);

        DepositTransaction firstDeposit = new DepositTransaction(9001, firstAccount, 4000, 5001);
        firstDeposit.start();

        DepositTransaction secondDeposit = new DepositTransaction(9002, secondAccount, 7000, 5002);
        secondDeposit.start();

        WithdrawTransaction secondWithdrawTransaction = new WithdrawTransaction(9003, secondAccount, 500, second);
        Thread secondWithdraw = new Thread(secondWithdrawTransaction);
        secondWithdraw.start();

        WithdrawTransaction firstWithdrawTransaction = new WithdrawTransaction(9004, firstAccount, 500, first);
        Thread firstWithdraw = new Thread(firstWithdrawTransaction);
        firstWithdraw.start();



    }
}
