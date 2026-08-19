package DSA.LamdaSort;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		int[][] boxTypes = {{5,10},{2,5},{4,7},{3,9}};
		Arrays.sort(boxTypes,(a,b) -> b[1]-a[1]); 
        // b-a => descending
        // a-b => ascending
        // if(a[0]==b[0] ? b[1]-a[1]: a[0]-b[0])
	}
}
