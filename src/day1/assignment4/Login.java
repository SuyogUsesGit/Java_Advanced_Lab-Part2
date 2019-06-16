package day1.assignment4;

import java.util.LinkedHashMap;
import java.util.Map;

public class Login {
    private Map<Integer, String> loginMap = new LinkedHashMap<>();

    public void addLogin(Integer customerId, String password) {
        loginMap.put(customerId, password);
    }
}
