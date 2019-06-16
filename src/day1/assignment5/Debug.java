package day1.assignment5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Debug {
    public void showRecords(Set<String> set) {
        if(!set.isEmpty()) {
            Iterator<String> i = set.iterator();
            while (i.hasNext()) System.out.println(i.next());
        } else System.out.println("Set is an empty set");
    }

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Lourie");
        set.add("Amy");
        set.add("Richard");
        set.add("Max");

        Debug debug = new Debug();

        System.out.println("Printing the records");
        debug.showRecords(set);
    }
}
