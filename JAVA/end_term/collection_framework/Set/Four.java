package Set;

import java.util.*;

public class Four {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        TreeSet<Integer> set  = new TreeSet<>();
        
        for(int i=0;i<n;i++){
            set.add(input.nextInt());
        }
        System.out.println(set);

        input.close();
    }
}
