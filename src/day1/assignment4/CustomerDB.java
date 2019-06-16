package day1.assignment4;

import java.util.*;

public class CustomerDB {
    private List<Customer> list = new ArrayList<>();

    public boolean saveCustomer(Customer customer) {
        return list.add(customer);
    }

    public List<Customer> getAllCustomers() {
        return list;
    }

    public Set<Integer> getloanAvailedCustomers() {
        Set<Integer> set = new TreeSet<>();

        Iterator<Customer> i = list.iterator();
        while (i.hasNext()) {
            Customer customer = i.next();
            if (customer.isLoanAvailed()) set.add(customer.getCustomerId());
        }
        return set;
    }


}
