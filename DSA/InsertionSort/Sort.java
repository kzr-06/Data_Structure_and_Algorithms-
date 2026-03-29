package DSA.InsertionSort;

import java.util.*;
public class Sort {
    public static void main(String[] args) {
        int[] arr ={9,5,6,3,8,1};

        int smin= Integer.MAX_VALUE;
        int min= Integer.MAX_VALUE;
        for(int num : arr){
    if(num < min){
        smin = min;  // previous min becomes smin
        min = num;
    } else if(num > min && num < smin){
        smin = num;  // candidate for second min
    }
}


System.out.println(min + " " + smin);








        for(int i=1;i<arr.length;i++){
            CorrectzPos(arr, i);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int[] CorrectzPos(int[] arr, int pos) {
        int temp =arr[pos];
        int start = pos-1;
        while(start>=0){
            if(arr[start]>temp){
                arr[start+1]= arr[start];
            }else{
                break;
            }
            start--;
        }
        arr[start+1]=temp;
        return arr;
    }
}
