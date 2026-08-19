package DSA.Recursion.Array;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,7};
        sort(arr, arr.length-1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr , int last,int start,int max){
        if(last == 0) return;
        if(start<=last){
            if(arr[start] > arr[max]){
                sort(arr, last, start+1, start);
            }
            else{
                sort(arr, last, start+1, max);
            }
        }
        else{
            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;
            sort(arr, last-1, 0, 0);
        }
    }
}
