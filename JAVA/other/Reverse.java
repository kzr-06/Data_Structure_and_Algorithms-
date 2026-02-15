package other;
import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4};

        Collections.reverse(Arrays.asList(arr));

        for(int n : arr){
            System.out.print(n + " ");
        }
    }
}
