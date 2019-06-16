package day1.assignment1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddCustomer {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Jack");
        list.add("Harry");
        list.add("Tabrez");
        list.add("Leezu");
        AddCustomer addCustomer = new AddCustomer();
        addCustomer.printCustomers(list);
    }

    private void printCustomers(List<String> list) {
        Iterator<String> iterator = list.iterator();
        System.out.println("Customers are: ");
        while(iterator.hasNext()) System.out.println(iterator.next());
    }
}
