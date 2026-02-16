package string;
import java.util.Scanner;

public class LastOccWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String word = input.nextLine();
        int wordl = word.length();
        int k=0;

 // ============================ Direct method =============================================  

        System.out.println(s.lastIndexOf(word));
        // fail in some cases

 // =========================================================================================       

        
        for(int i=0;i<s.length();i++){
            String s1="";
            if((i+wordl)<=s.length()){
                s1= s.substring(i, i+wordl);
            }
            if(s1.equals(word) && s.charAt(i-1)==' '){
                k=i;

            }

        }
        System.out.println(k);
        input.close();
    }
}
