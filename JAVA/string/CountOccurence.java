package string;

import java.util.Scanner;

public class CountOccurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        char c = input.next().charAt(0);
        int j=0;
        for(int i=0;i<n.length();i++){
            if(n.charAt(i) == c){
                j++;
            }
            }
        
        System.out.println(j);
        
        input.close();  
    }
}
