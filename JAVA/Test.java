package JAVA;
class A {
    A() { System.out.println("A"); }
}
class B extends A {
    B(int x) { System.out.println("B"); }
}
public class Test {
    public static void main(String[] args) {
        new B(10);
    }
}
