package ArrayList;

import java.util.*;

public class Ten {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> l1 = new ArrayList<>();
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            l1.add(input.nextInt());
        }
        
        int k = input.nextInt();
        
        Collections.rotate(l1, k);    // keep the common element
        System.out.println(l1);

        input.close();
    }
}
