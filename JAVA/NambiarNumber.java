package JAVA;
// 9880127431 ----> [26][9][7][1] ----> 26971


import java.util.*;

public class NambiarNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();

        StringBuffer arr=new StringBuffer();

        int ts=0;
        int ats=0;
        int j;

        for(int i=0;i<10;i++){
            int s=0;
            int digit = Integer.parseInt(String.valueOf(n.charAt(i)));
            String eo = digit%2==0?"even":"odd";
            for(j=i;j<10;j++){
                int d = Integer.parseInt(String.valueOf(n.charAt(j)));
                s+=d;
                ts+=d;
                System.out.println(s+" "+ts);
                String eo1 = s%2==0?"even":"odd";
                if(!eo.equals(eo1)){
                    arr.append(String.valueOf(s));
                    ats+=s;
                    break;
                }
            }
            i=j;
        }
        
        System.out.println(ts);
        System.out.println(ats);
        if(ts-ats != 0){
            arr.append(ts-ats);
        }else if(n.charAt(9)=='0'){
            arr.append(0);
        }
        System.out.println(arr.toString());

        input.close();

    }
    
}
