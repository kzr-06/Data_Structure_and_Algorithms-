package string;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = new String();
        s1 = input.nextLine();
        String s2 = new String();
        s2 =input.nextLine();
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Same");
        }
        else{
            System.out.println("Not");
        }
        
        input.close();
    }
}
