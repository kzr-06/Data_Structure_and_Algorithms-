package string;
import java.util.Scanner;

public class FirstOccWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String word = input.nextLine();
        int wordl = word.length();

    // ====================================== Direct method ===================================================
        
        System.out.println(s.indexOf(word)); 
        // in some cases it fails

    // ========================================================================================================    

        for(int i=0;i<s.length();i++){
            String s1="";

            if(i+wordl <= s.length()){

                s1= s.substring(i, i+wordl);
            }
            if(s1.equals(word) && s.charAt(i-1) == ' '){
                System.out.println(i);
                break;

            }

        }
        input.close();
    }
}
