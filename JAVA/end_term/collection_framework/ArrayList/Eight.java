package ArrayList;

import java.util.*;

public class Eight {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> l1 = new ArrayList<>();
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            l1.add(input.nextInt());
        }
        
        Collections.sort(l1);
        System.out.println("Lowest: "+l1.get(0));
        System.out.println("Highest: "+l1.get(l1.size()-1));

        input.close();
    }
}
