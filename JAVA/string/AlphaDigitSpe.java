package string;

import java.util.Scanner;

public class AlphaDigitSpe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine().toLowerCase();
        int a=0;
        int n=0;
        int ss=0;
        for(int i=0;i<s.length();i++){
            char k= s.charAt(i);
            if(k>='a' && k<='z'){
                a++;
            }
            else if(k>='0' && k<='9'){
                n++;
            }
            else{
                ss++;
            }
        }
        System.out.println("alpha: "+a);
        System.out.println("number: "+n);
        System.out.println("special: "+ss);

        input.close();
    }
}
