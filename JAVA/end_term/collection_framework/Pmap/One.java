package Pmap;

import java.util.*;

public class One {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Alice",85);
        map.put("Bob",90);
        map.put("Charlie",75);
        map.put("Tery",80);
        map.put("Kery",75);

        System.out.println(map.get("Bob"));
    }
}
