package Set;

import java.util.*;

public class Nine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        HashSet<Integer> set1 = new HashSet<>();
        for(int i=0;i<n;i++){
            set1.add(input.nextInt());
        }
        
        n = input.nextInt();

        HashSet<Integer> set2 = new HashSet<>();
        for(int i=0;i<n;i++){
            set2.add(input.nextInt());
        }
        if(set1.containsAll(set2)) {
            System.out.println("set2 is a subset of set1");
        } else {
            System.out.println("set2 is not a subset of set1");
        }

        input.close();
    }
}
