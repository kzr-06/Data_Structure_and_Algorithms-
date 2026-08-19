package DSA.Recursion.Permutation;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        //permutation("", "abcdefghijklmnopqrstuvwxyz");
        // System.out.println(permutationList("", "abc"));
        System.out.println(permutationCount("", "abcdefghijklmnopqrstuvwxyz"));
    }

    static void permutation(String p,String up){
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0, i);
            String e = p.substring(i);
            permutation(f+ch+e, up.substring(1));
        }


    }

    static ArrayList<String> permutationList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        // local to this call 
        ArrayList<String> list = new ArrayList<>();

        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0, i);
            String e = p.substring(i,p.length());
            list.addAll(permutationList(f + ch + e, up.substring(1)));
        }
        return list;
    }

    static int permutationCount(String p,String up){
        if(up.isEmpty()) {
            System.out.println(p);
            return 1;
        }
        int count =0;
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0, i);
            String e = p.substring(i);
            count = count + permutationCount(f+ch+e, up.substring(1));
        }
        return count;
    }
}
