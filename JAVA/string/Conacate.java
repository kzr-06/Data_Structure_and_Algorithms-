package string;

import java.util.Scanner;

public class Conacate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //  String s1 = new String();
        // s1 = input.nextLine();
        // String s2 = new String();
        // s2 =input.nextLine();

        String s1 = input.nextLine();
        String s2 = input.nextLine();
        s1 = s1+s2;
        System.out.println(s1);

        input.close();

    }
}
