package string;

import java.util.Scanner;

public class RemoveAllOccWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String word = input.nextLine();
        int wordl = word.length();
        String rs="";
  

        for(int i=0;i<s.length()-wordl;i++){
            String s1 =s.substring(i, i+wordl);
            if(s1.equals(word) && s.charAt(i-1)==' '){
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
