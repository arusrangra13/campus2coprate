import java.util.*;

public class Stringbasic {
    public static void main(String[] args){
        String str= "Arus rangra";
        System.out.println("Length of str: " + str.length());
        System.out.println("Second char:"+ str.charAt(2));
        System.out.println("Uppercase:"+ str.toUpperCase());
        System.out.println("Lowercase:"+ str.toLowerCase());
        System.out.println("Sub String:"+ str.substring(3,7));
    }
    
}
