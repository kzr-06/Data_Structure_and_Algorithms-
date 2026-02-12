package kk;

public class wrapper {
    public static void main(String[] args) {
        
        // int a=10;
        // Integer num = 45; // its an object and attrinutes
        // final int INCREASE =10; //now it can not be changed and it should be intialized while decarling it ony in primitive

        // when a non primitive is final u cannot reassigned it but ca change valuemeans u can change fields 


    }
    // something which is not static belongs to object then it would be called through class and obj
    void greetings(){
        System.out.println("good morning ");
    }
    // u can not call non-static function directly in ststic one u should be make other class and make obj in static one then u are able to call the non-static function through obj only   
    void name(){
        greetings();
        System.out.println("Parth");
    }


    
}
