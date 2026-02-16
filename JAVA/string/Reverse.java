package string;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s= input.nextLine();
        String rs ="";
        for(int i=0; i<s.length();i++){
            char k = s.charAt(i);
            rs=k+rs;
        }
        System.out.println(rs);

        input.close();
    }
}
