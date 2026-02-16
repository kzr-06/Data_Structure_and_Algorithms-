package string;

import java.util.Scanner;

public class HighestFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        // String[] s=n.split(" ");
        int[] arr = new int[255];
        
        // for(int i=0;i<s.length;i++){
        //     String is=s[i];
            // for(int j=0;j<is.length();j++){
            //     arr[is.charAt(j)]++;
            // }
        // }

        for(int i=0;i<n.length();i++){
            arr[(int)n.charAt(i)]++;
        }

        int c=0;
        int k=0;
        
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>c){
        //         c=arr[i];
        //         k=i;
        //     }
        // }
        
        for(int i=0;i<n.length();i++){
            int j=(int)n.charAt(i);
            if(arr[j]>c && j!=32){
                c=arr[j];
                k=j;
            }
        }

        System.out.println(k);
        System.out.println((char)k);
        
        input.close();
    }
}
