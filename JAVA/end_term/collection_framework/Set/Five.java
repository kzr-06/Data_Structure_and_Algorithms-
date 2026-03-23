package Set;

import java.util.*;

public class Five {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        HashSet<String> set  = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(input.next());
        }
        
        String k = input.next();
        set.remove(k);
        System.out.println(set);


        input.close();
    }
}
