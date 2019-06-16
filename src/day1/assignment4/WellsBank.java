package day1.assignment4;

import java.util.List;
import java.util.Set;

public class WellsBank {
    private static final CustomerDB customerDB = new CustomerDB();

    public static final Login login = new Login();

    public static void main(String[] args) {
        Customer cust1 = new Customer(1001, "Tan", false);
        customerDB.saveCustomer(cust1);
        login.addLogin(1001, "Wells123");

        Customer cust2= new Customer(1002, "John", true);
        customerDB.saveCustomer(cust2);
        login.addLogin(1001, "Wells123");

        Customer cust3 = new Customer(1003, "Sam", true);
        customerDB.saveCustomer(cust3);
        login.addLogin(1001, "Mys@123");

        Customer cust4 = new Customer(1004, "Raj", false);
        customerDB.saveCustomer(cust4);
        login.addLogin(1001, "Wells123");

        List<Customer> list = customerDB.getAllCustomers();
        if(list.isEmpty()) System.out.println("There are no customers in the list");
        else System.out.println(list);

        Set<Integer> loanAvailedCustomers = customerDB.getloanAvailedCustomers();
        System.out.println("Customers who have availed the loan: ");
        System.out.println(loanAvailedCustomers);


    }
}
