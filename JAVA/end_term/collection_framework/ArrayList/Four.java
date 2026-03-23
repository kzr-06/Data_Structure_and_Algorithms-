package ArrayList;

import java.util.*;

public class Four {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> l = new ArrayList<>();
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            l.add(input.next());
        }
        
        Collections.reverse(l);
        System.out.println(l);

        input.close();
    }
    
}
