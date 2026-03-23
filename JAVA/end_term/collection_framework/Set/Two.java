package Set;

import java.util.HashSet;
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        HashSet<String> set  = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(input.next());
        }
        
        String k= input.next();
        if(set.contains(k)){
            System.out.println(k+" is present in the set");
        }
        else{
            System.out.println(k+" is not present in the set");
        }
    input.close();
    }
}
