package string;

import java.util.Scanner;


public class Rlow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String word = input.nextLine();
        int wordl = word.length();
        int wc=0;

        for(int i=0;i<=s.length()-wordl;i++){
            String s1 = s.substring(i, i+wordl);
            if(s1.equals(word) && s.charAt(i-1)==' '){
                wc++;
            }
        }

        String rs=" ";
        int wc2=0;

        for(int i=0;i<=s.length()-wordl;i++){
            String s1 = s.substring(i, i+wordl);
            if(s1.equals(word) && s.charAt(i-1)==' '){
                wc2++;
            }
            if(wc2!=wc){
                rs=rs+s.charAt(i);
            }
        }
        System.out.println(rs);
        int index = s.lastIndexOf(word); // find last occurrence

        if (index != -1) {
            String result = s.substring(0, index) + s.substring(index + word.length());
            System.out.println(result.trim());
        } else {
            System.out.println("Word not found");
        }



        input.close();
    }
}
