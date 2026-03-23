package ArrayList;

import java.util.*;

public class Three {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> l = new ArrayList<>();
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            l.add(input.nextInt());
        }

        l.removeIf(x->x%2==0);
        
        // for(int i=0;i<l.size();i++){
            // if(l.get(i)%2==0){
            //     l.remove(i);
            // }
        // }
        System.out.println(l);

        input.close();
    }
    
    
}
