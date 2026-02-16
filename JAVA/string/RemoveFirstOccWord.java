package string;

import java.util.Scanner;

public class RemoveFirstOccWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String word = input.nextLine();
        int wordl = word.length();
        String rs="";

        
        for(int i=0;i<s.length();i++){
            int wi=(s.indexOf(word,i));  
            if(i==wi && s.charAt(i-1)==' ' ){
                i=i+wordl;
                continue;
            }
            rs=rs+s.charAt(i);

        }
        // my name is kesar and my favorite hobby is sleeping and my favorite dish is 
        System.out.println(rs);
        input.close();
    }
}
