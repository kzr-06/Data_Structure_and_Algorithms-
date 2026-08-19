package JP;

import java.util.*;

public class Two {
    public static void main(String[] args) {
        String s ="PDOQERODEQPNR";
        String t ="PQR";
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch, 0);
            }
            map.put(ch, map.get(ch)+1);
        }
        int j=0;
        for(int i=0;i<s.length();i++){

        }
    }
    
}
