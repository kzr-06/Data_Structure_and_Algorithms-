package kk.inheritance;

public class BoxWeight extends Box {
    double weight;

    BoxWeight(){
        this.weight = -1;
        // this.l = something;  // i cannot use it here becoz it is now private but i can use it in that class where it is in 
        // and in the super it calls box constructor which is in that class where this variavle is 
    }
    
    BoxWeight(double l ,double h ,double w ,double weight){
        // super(l,w,h); // call the parent class consrtuctior accordingly
        // used to intialise values present in parent class 
        this.weight = weight;
        // super(l,w,h);    // error parent class should intialise first                         
    
}


    BoxWeight(double side,double weight){
        super(side);
        this.weight = weight;
    }


    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }
}
