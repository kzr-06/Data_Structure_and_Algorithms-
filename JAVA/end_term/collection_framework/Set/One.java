package Set;
import java.util.*;

public class One {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(input.nextInt());
        }

        System.out.println(set);

        input.close();
    }
}
