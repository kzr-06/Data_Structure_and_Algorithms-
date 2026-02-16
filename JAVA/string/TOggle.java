package string;

import java.util.Scanner;

public class TOggle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        // a=97
        // z=122
        // A=65
        // Z=90
        String r="";
        for(int i=0; i<s.length();i++){
            char k =s.charAt(i);
            if(k>='a' && k<='z'){
                k=(char)((int)k-32);
            }
            else if(k>='A' && k<='Z'){
                 k=(char)((int)k+32);
            }
            r=r+k;
        }

        System.out.println(r);

        input.close();
    
    }
}
