package string;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        String s= input.nextLine();
        String[] arr = s.split(" ");
        String rs="";
        // for(int i=0,j=arr.length-1;i<j;i++,j--){
        //     String temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;
        // }

        // for(int i=0;i<arr.length;i++){
        //     rs+=arr[i];
        //     if(i<arr.length-1){
        //         rs+=" ";
        //     }
        // }

        for(int i=0;i<arr.length;i++){
            String rss="";
            for(int j=0; j<arr[i].length();j++){
                char k = arr[i].charAt(j);
                rss=k+rss;
            }
            rs=rs+rss;
            rs=rs+" ";
        }
        System.out.println(rs);

        input.close();
    }
}
