package Set;

import java.util.*;

public class Ten {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<n;i++){
            set.add(input.nextInt());
        }
        
        int k = input.nextInt();
        // set.subSet(k,set.getLast()); 
        // [8,10,12]
        int numbers = set.subSet(k,set.getLast()).size();
        System.out.println(numbers);
        

        input.close();
    }
}
