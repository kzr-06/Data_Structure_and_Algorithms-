package JAVA;
import java.util.Scanner;

public class ss {
    public static void longestCommonPrefix(String[] strs) {
        String s="";
        String a=strs[0];

        for(int i=0;i<a.length();i++){

            char c=a.charAt(i);
            int k=0;
            int o=0;

            for(int j=1;j<strs.length;j++){
                String z=strs[j];
                String sz=z.substring(i);
                if(sz.length()>=1 && z.charAt(i)==c){
                    k++;
                }
                else{
                    o=1;
                    System.out.println(1);
                    break;
                }
            }

            if(k==strs.length-1){
                s=s+a.charAt(i);
            }
            if(o==1){
                break;
            }
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[3];
        for(int i=0;i<3;i++){
            arr[i]=input.next();
        }
        longestCommonPrefix(arr);
        input.close();
    }
}
