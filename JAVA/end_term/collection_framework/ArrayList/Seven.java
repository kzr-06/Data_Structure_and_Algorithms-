package ArrayList;

import java.util.*;

public class Seven {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            l1.add(input.nextInt());
        }
        for(int i=1;i<=n;i++){
            l2.add(input.nextInt());
        }
        
        l1.retainAll(l2);    // keep the common element
        System.out.println(l1);

        input.close();
    }
    
}
