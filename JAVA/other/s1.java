package other;
//     }

//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);

//         String name =sc.nextLine();
//         int age =sc.nextInt();

//         display(name,age);

//         sc.close();
//     }

// }

// 

// class Check{
//     public static void check(int n){
//         if(n%2==0){
//             System.out.println("Even");
//         }
//         else{
//             System.out.println("Odd");
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();

//         check(n);
//     }
// }

import java.util.Scanner;

// class largest{

//     public static void largest(int a,int b,int c){
//         if(a>b && a>c){
//             System.out.println(a);
//         }
//         else if(b>a && b>c){
//             System.out.println(b);
//         }
//         else{
//             System.out.println(c);
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c=sc.nextInt();

//         largest(a, b, c);

//         sc.close();
// }
// }

class Marks{
    public static void calculate(int[] marks) {
        int a=marks[0];
        int b=marks[1];
        int c=marks[2];
        int d=marks[3];
        int e=marks[4];
        int s=a+b+c+d+e;
        int av = (int)s/5;

        System.out.println("Total: "+s);
        System.out.println("Average: "+av);

        if(av>=90){
            System.out.println("Grade: A");        
        }
        else if(av>=75){
            System.out.println("Grade: B");
        }
        else if(av>=60){
            System.out.println("Grade: C");
        }
        else if(av>=40){
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Grade: Fail");
        }
        
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        for(int i=0; i<5; i++){
            marks[i]=sc.nextInt();
        }
        
        calculate(marks);

        sc.close();



}
}