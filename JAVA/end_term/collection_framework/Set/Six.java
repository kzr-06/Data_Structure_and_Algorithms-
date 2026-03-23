package Set;

import java.util.*;

public class Six {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        HashSet<String> set1  = new HashSet<>();
        for(int i=0;i<n;i++){
            set1.add(input.next());
        }
        
        HashSet<String> set2  = new HashSet<>();
        for(int i=0;i<n;i++){
            set2.add(input.next());
        }

        set1.retainAll(set2);
        System.out.println(set1);

        input.close();
    }
}
