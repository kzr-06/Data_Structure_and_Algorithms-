package kk.inheritance;
public class inheritance {
    // public static void main(String[] args) {
    //     Box box = new Box(4);
    //     // Box box2 = new Box(box);
    //     System.out.println(box.l+" "+box.h+" "+box.w);
    //     // if l is private i can not access it here
    //     // System.out.println(box2.l+" "+box2.h+" "+box2.w);

    //     BoxWeight box3 = new BoxWeight();
    //     BoxWeight box4 = new BoxWeight(2,3,4,5);
    //         System.out.println(box3.h+" "+box3.weight);
    //         System.out.println(box4.h+" "+box4.weight);
    // Box box5 = new BoxWeight(2,3,4,8);
    // System.out.println(box5.getClass());  // BoxWeight
    // System.out.println(box5);  //kk.BoxWeight@28a418fc (package.class@add)
    // System.out.println(box5.weight);  // it can access weight 
    // it is a refrence type of box and it is refrencing to object boxweight
    
    // BoxWeight box6 = new Box(2,3,4);
    //error
    //
    
    // }

    public static void main(String[] args) {
        BoxPrice box = new BoxPrice(5,8,200);
        System.out.println(box.l);
        System.out.println(box.w);
        System.out.println(box.h);
        System.out.println(box.weight);
        System.out.println(box.cost);
    }
    
} 
