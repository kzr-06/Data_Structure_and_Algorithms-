package Set;

import java.util.*;

public class Three {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        LinkedHashSet<String> set  = new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            set.add(input.next());
        }
        System.out.println(set);

        input.close();
    }
}
