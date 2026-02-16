package string;

import java.util.Scanner;

public class LowestFrequency {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        String[] s=n.split(" ");
        int[] arr = new int[255];
        
        for(int i=0;i<s.length;i++){
            String is=s[i];
            for(int j=0;j<is.length();j++){
                arr[is.charAt(j)]++;
            }
        }

        int c=Integer.MAX_VALUE;
        int k=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<c && arr[i]>0 ){
                c=arr[i];
                k=i;
            }
        }
        
        System.out.println(k);
        System.out.println((char)k);
        
        input.close();
    }
}
