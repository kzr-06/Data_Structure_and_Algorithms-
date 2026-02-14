/*
 You are given M boys and N girls. You have find whether it is possible to divide boys and girls in such a way such that each project group have exactly same number of boys and girls. If possible, print Number of Boys, B in project group and Number of Girls, G in project group such that there are maximum possible project groups, Otherwise print Not Possible.

Input Format

First line contains, T, number of testcases. For each testcase, single line contains two space separated integers, M and N.

Constraints

0 <= |M,N| <= 10000000000

Output Format

For each testcase, it possible, then print space separated B and G, Otherwise print Not Possible.

Sample Input 0

37
492600 927045
876443 896078
68867 589636
108461 543148
213642 353898
489861 496726
145500 76565
988142 469600
419750 620067
446480 47409
499851 219381
35883 662853
934678 407949
187971 745204
568987 299161
714442 214949
457428 512362
978982 502245
160267 129091
309501 984829
102222 941230
131258 659127
604683 294757
742265 575499
768694 529542
687007 290295
575879 834190
118640 475478
87870 172046
957468 679790
728171 176583
928759 732502
520296 243148
295648 145538
707346 662046
72117 932996
65603 370771
Sample Output 0

32840 61803
Not Possible
Not Possible
Not Possible
11869 19661
Not Possible
29100 15313
494071 234800
Not Possible
Not Possible
166617 73127
11961 220951
Not Possible
Not Possible
Not Possible
Not Possible
228714 256181
Not Possible
Not Possible
Not Possible
51111 470615
Not Possible
Not Possible
Not Possible
384347 264771
Not Possible
Not Possible
59320 237739
43935 86023
478734 339895
Not Possible
Not Possible
130074 60787
147824 72769
117891 110341
Not Possible
Not Possible
 */

import java.util.Scanner;

public class Gcd {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int r=0;r<t;r++){
            int m = input.nextInt();
            int n = input.nextInt();
            int k;
            if(m>n){
                k=n;
            }
            else{
                 k=m;
            }
            int j=1;
            for (int i=k;i>1;i--){
                if(m%i == 0 && n%i == 0){
                    j=i;
                    break;
                }
            }
            if(j!=1){
                System.out.println(m/j+" "+n/j);
            }
            else{
                System.out.println("Not Possible");
            }
    }
    input.close();
}
}
