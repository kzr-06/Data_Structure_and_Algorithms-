package string;

import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = new String();
        s1 = input.nextLine().toLowerCase();
        String s2 = new String();
        s2 =input.nextLine().toUpperCase();
        System.out.println(s1);
        System.out.println(s2);

        input.close();

    }
}
