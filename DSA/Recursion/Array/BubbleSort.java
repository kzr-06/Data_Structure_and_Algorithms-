package DSA.Recursion.Array;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,11};
        sort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));

    }

    public static void sort(int[] arr,int last,int start){
        if(last == 0) return;
        if(last == start)  {
            sort(arr, last-1, 0);
            return;
        }
        if(arr[start] > arr[start+1]){
            int temp = arr[start];
            arr[start] = arr[start+1];
            arr[start+1] = temp;
        }
        sort(arr, last, start+1);
    }
}
