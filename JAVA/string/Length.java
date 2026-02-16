package string;
import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter");
        String s = input.nextLine();
        int n = s.length();
        System.out.println(n);

        input.close();
    }
}
