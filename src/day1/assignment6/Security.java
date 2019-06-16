package day1.assignment6;

import day1.assignment4.Customer;

public class Security {


    public void authorization(Account account, Customer customer) throws UnauthorizedWithdrawTransactionException {
        if(account.getCustomer().getCustomerId()!=customer.getCustomerId()) throw new UnauthorizedWithdrawTransactionException();
    }


}
