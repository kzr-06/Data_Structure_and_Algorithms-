import java.util.*;

public class list {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
//1.
    
    // List n = new ArrayList();
    // n.add(input.nextLine());
    // n.add(input.nextLine());
    // n.add(input.nextLine());
    // n.add(input.nextLine());
    // n.add(input.nextLine());
    // System.out.println(n);
    // n.remove(3);
    // System.out.println(n);
    // n.set(2, "Running shoes");
    // System.out.println(n);
    // System.out.println(n.size());
    
    List<String> n = new ArrayList<>();
    List<String> n1 = new ArrayList<>();

//2.
    
    // for(int i=0;i<5;i++){
    //     n.add(input.nextLine());
    // }
    // System.out.println(n);
    // n.remove(2);
    // System.out.println(n);
    // n.set(0, "Parth");
    // System.out.println(n);
    // System.out.println(n.get(2));

//3.
    // for(int i=0;i<5;i++){
    //     n.add(input.nextLine());
    // }
    // n.set(0, "Aadat");
    // n.remove(2);
    // System.out.println(n);
    // System.out.println(n.size()); 
    
    // example of removeAll
    n.add("apple");
    n.add("banana");
    n.add("orange");
    n.add("banana");
    n.add("grape");
    
    n1.add("Apple");
    n1.add("Banana");
    n1.add("orange");
    n1.add("banana");
    n1.add("Grape");
    System.out.println("Original list: " + n);

    // n.retainAll(n1);  // gives common
    n.removeAll(n1);  // remove common
    System.out.println("After removeAll: " + n);

    input.close();

}
}
