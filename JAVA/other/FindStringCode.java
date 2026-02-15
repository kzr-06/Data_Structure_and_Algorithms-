package other;

import java.util.*;

public class FindStringCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        s=s.toUpperCase();

        String[] arr = s.split(" ");
        int[] narr = new int[arr.length];
        int c=0;

        for(String k:arr){
            int sum=0;
            for(int i=0,j=k.length()-1;i<=j;i++,j--){
                int n=0;
                if(i!=j){
                    n= Math.abs(k.charAt(i)-k.charAt(j));    
                }
                else{
                    n= Math.abs(64-k.charAt(i));
                }
                sum+=n;
                System.out.println(sum);
            }
            narr[c++] = sum;
        }

        int n=0;
        for(int num:narr){
            int len = String.valueOf(num).length();
            n = n*(int)Math.pow(10, len)+num;
        }
        System.out.println(n);












        input.close();

    }
    
}
