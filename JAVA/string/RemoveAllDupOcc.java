package string;

import java.util.Scanner;

public class RemoveAllDupOcc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine().toLowerCase();
        int[] arr = new int[26];
        String s="";

        for(int i=0;i<n.length();i++){
            char c =n.charAt(i);
            if(c!=' ')arr[c-97]++;
        }
        
        for(int i=0;i<n.length();i++){

            char c =n.charAt(i);

            // if(c ==' ' ){
            //     s=s+n.charAt(i);
            // }
            // else if(arr[c-97]==1){
            //     s=s+n.charAt(i);

            // }  // parth gar -> pth g

            if(c ==' ' ){
                s=s+n.charAt(i);
            }
            else if(arr[c-97]>1){
                s=s+n.charAt(i);
                arr[c-97]=0;

            }
            else if(arr[c-97]==1){
                s=s+n.charAt(i);

            }
        } 
        // parth garg
        // parth g
        System.out.println(s);
           
    
            input.close();
        }
    }

