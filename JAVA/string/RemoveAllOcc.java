package string;

import java.util.Scanner;

public class RemoveAllOcc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        char c = input.next().charAt(0);
        String s="";

        for(int i=0;i<n.length();i++){
            if((int)n.charAt(i) == (int)c ){
                continue;  
            }
            s=s+n.charAt(i);
        }
        System.out.println(s);

        input.close();
    }
}
