
import java.util.*;

public class Stringbasic{
      public static void main(String[] args){
        String str = "Arus rangra";
        System.out.println(str);
        
    }
}

// ---------------------------------------------------------------------
// charAt
import java.util.*;

public class Stringbasic{
      public static void main(String[] args){
        String str = "Arus rangra";
        System.out.println(str);

        for (int i =0;i<str.length();i++)
             System.out.println(str.charAt(i));
            
        
    }
}

//-----------------------------------------------------------------------
// To reverse in charAt
import java.util.*;

public class Stringbasic{
      public static void main(String[] args){
        String str = "Arus rangra";
        System.out.println(str);
        
          for (int i = str.length()-1;i>=0;i--)
                System.out.println(str.charAt(i));
        
        }
}

