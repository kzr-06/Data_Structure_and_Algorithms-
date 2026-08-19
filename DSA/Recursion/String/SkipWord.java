package DSA.Recursion.String;

public class SkipWord {
    public static void main(String[] args) {
        System.out.println(skipWord("bdapplebananafg","banana"));
        System.out.println(skipWord1("bdapplefgappkg"));
    }

    public static String skipWord(String s,String remove){
        if(s.isEmpty()){
            return "" ;
        }
        char ch = s.charAt(0);
        if(s.startsWith(remove)){
            return skipWord(s.substring(remove.length()),remove);
        }else{
            return ch+skipWord(s.substring(1),remove);
        }
    }

    public static String skipWord1(String s){
        if(s.isEmpty()){
            return "" ;
        }
        char ch = s.charAt(0);
        if(s.startsWith("app") && !s.startsWith("apple")){
            return skipWord1(s.substring(3));
        }else{
            return ch+skipWord1(s.substring(1));
        }
    }
}


// O(n) - n is length of string