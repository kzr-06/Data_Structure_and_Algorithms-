package JP;

import java.util.Scanner;

public class OneOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
      
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int value= (ch-'a') +1;
            ans = ans*20 + value;

        }
        System.out.println(ans);
    }
}
