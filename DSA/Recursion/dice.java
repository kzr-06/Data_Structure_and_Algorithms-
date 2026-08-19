package DSA.Recursion;

import java.util.ArrayList;

public class dice {
    public static void main(String[] args) {
        ArrayList<String> ans =  dice1("",2);
        System.out.println(ans);
    }

    public static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6 && i<= target;i++){
            dice(p+i,target-i);
        }
    }


    public static ArrayList<String> dice1(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i=1;i<=6 && i<= target;i++){
            ans.addAll(dice1(p+i,target-i));
        }
        return ans;
    }

    public static ArrayList<String> diceFace(String p, int target, int face){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i=1;i<=face && i<= target;i++){
            ans.addAll(diceFace(p+i,target-i,face));
        }
        return ans;
    }
}
