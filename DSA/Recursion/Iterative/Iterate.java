package DSA.Recursion.Iterative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Iterate {
    public static void main(String[] args) {
        int[] arr ={1,2,2,3};
        System.out.println(subSetDup(arr));
    }

    static List<List<Integer>> subSet(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num :arr){
            int n=outer.size();
            for(int i=0;i<n;i++){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner); 
            }

        }

        return outer;

    }
    
    // O(n*2^n) -> n is no of subset
    // O(2^n*n) -> total subset * space by each array
    
   static List<List<Integer>> subSetDup(int[] arr) {
    Arrays.sort(arr);
    List<List<Integer>> outer = new ArrayList<>();
    outer.add(new ArrayList<>());

    int start = 0;
    int end = 0;

    for (int j = 0; j < arr.length; j++) {
        start = 0;

        // if current and previous element are same, start from last added subsets
        if (j > 0 && arr[j] == arr[j - 1]) {
            start = end + 1;
        }

        end = outer.size() - 1;

        int n = outer.size();
        for (int i = start; i < n; i++) {
            List<Integer> inner = new ArrayList<>(outer.get(i));
            inner.add(arr[j]);
            outer.add(inner);
        }
    }

    return outer;
}
}