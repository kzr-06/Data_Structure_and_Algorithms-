package string;

import java.util.Scanner;

public class RemoveLastOcc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        char c = input.next().charAt(0);
        String s="";
        int k=0;

        for(int i=n.length()-1;i>=0;i--){
            if((int)n.charAt(i) == (int)c && k==0){
                k=1;
                continue;  
            }
            s=n.charAt(i)+s;
        }
        System.out.println(s);

        input.close();

    }
}
