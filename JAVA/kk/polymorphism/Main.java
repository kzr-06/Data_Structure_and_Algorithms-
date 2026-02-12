package kk.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circles circle = new Circles();
        Squares square = new Squares();

        shape.area();    
        square.area();
        circle.area();

    }
}
