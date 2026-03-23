package ArrayList;

import java.util.ArrayList;
import java.util.*;
public class First {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> l = new ArrayList<>();
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            l.add(input.next());
        }
        
        for(int i=0;i<n;i++){
            System.out.println(l.get(i));
        }

        input.close();
    }
    
}
