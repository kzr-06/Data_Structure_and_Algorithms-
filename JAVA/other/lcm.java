package other;
import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int lcm = Math.max(n1, n2);
        int n3=lcm;
        // while (true) { 
        //     if (lcm%n1 == 0 && lcm%n2 == 0){
        //         break;
        //     }
        //     lcm++;
        // }

        for (int i=2; ; i++){
            if (lcm%n1 == 0 && lcm%n2 == 0){
                break;
            }
            lcm = n3*i;
        }
        System.out.println(lcm);
        sc.close();
    }
}

