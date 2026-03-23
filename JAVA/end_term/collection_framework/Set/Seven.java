package Set;

import java.util.*;

public class Seven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        List<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            list.add(input.nextInt());
        }

        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);

        
        // Set<Integer> set = new LinkedHashSet<>(list);
        // order maintain rahega


        input.close();
    }
}
