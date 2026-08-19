package DSA.Recursion.Array;

import java.util.ArrayList;

public class Allindex {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,3,3};
        find(arr, 3, 0);
        System.out.println(list);
        System.out.println(find(arr, 3, 0, new ArrayList<>()));
    }

    static ArrayList<Integer> list = new ArrayList<>();
    public static void find(int[] arr, int target,int idx){
      if(idx == arr.length) return ;
      if(arr[idx] == target) list.add(idx);
    find(arr,  target, idx+1);
    
}

    public static ArrayList<Integer> find(int[] arr, int target,int idx,ArrayList<Integer> list ){
        if(idx == arr.length) return list;
        if(arr[idx] == target) list.add(idx);
         return find(arr,  target, idx+1,list);
}

    public static ArrayList<Integer> find1(int[] arr, int target,int idx ){
        ArrayList<Integer> list = new ArrayList<>();
        if(idx == arr.length) return list;
        if(arr[idx] == target) list.add(idx);
        ArrayList <Integer> ans = find1(arr, target, idx+1);
        list.addAll(ans);
        return list;
}
}