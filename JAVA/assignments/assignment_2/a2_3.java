
import java.util.Scanner;

class Student{
    String name;
    double marks;

    Student(String name,double marks){
        this.name = name;
        this.marks=marks;
    }
    void displayInfo(){
        System.out.println("Name: "+name +", Marks: "+marks);
    }
}

public class a2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        double marks = input.nextDouble();

        Student student1 = new Student(name,marks);
        student1.displayInfo();
        input.close();
    }
    
}
