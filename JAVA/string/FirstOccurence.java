package string;

import java.util.Scanner;

public class FirstOccurence {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        char c = input.next().charAt(0);
        int j=0;
        for(int i=0;i<n.length();i++){
            if(n.charAt(i) == c){
                j=i;
                break;
            }
            }
        
        System.out.println(j+1);
        
        input.close();          
    }
}
