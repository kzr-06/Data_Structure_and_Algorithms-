package JAVA;
import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        int[] arr = new int[]{5,7,7,8,10,12,5};
        int l = arr[arr.length-1];
        int i = arr.length-2;
        while(i>0){
            if(arr[i]>l){
                arr[i+1]=arr[i];
            }else break;
            i--;
        }
        arr[i+1] = l;
        System.out.println(Arrays.toString(arr));

    
    }
}
