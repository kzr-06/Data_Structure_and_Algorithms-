package ArrayList;
import java.util.*;

public class Seocnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> l = new ArrayList<>();
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            l.add(input.nextInt());
        }

        int target = input.nextInt();
        System.out.println(l.indexOf(target));
        
        // for(int i=0;i<l.size();i++){
        //     if(l.get(i)==target){
        //         System.out.println(i);
        //         break;
        //     }
        // }

        input.close();
    }
}
