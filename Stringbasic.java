// Simple String print
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

//------------------------------------------------------------------------
// Display Alternate Characters of a String
import java.util.*;

public class Stringbasic{
      public static void main(String[] args){
        String str = "Arus rangra";
        System.out.println(str);
        
          for (int i = 0;i<str.length();i=i+2)
                System.out.println(str.charAt(i));
        
        }
}

//------------------------------------------------------------------------
//Check whether two strings are equal and explain String Pool vs new String()
import java.util.*;

public class Stringbasic{
      public static void main(String[] args){
        String str1 = "ARUS";
        String str2 = "ARUS";

        String str3 = new String("ARUS");

        if(str1==str3){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        }
}

//--------------------------------------------------------------------------
// should we use .equals() instead of == for Strings
import java.util.*;
public class Stringbasic{
    public static void main(String[] args){
        String str1 = "ARUS";
        String str2 = "ARUS";

        String str3 = new String("ARUS");

        if(str1.equals(str3)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}

//-----------------------------------------------------------------------------
//Using Ignorecse 
import java.util.*;
public class Stringbasic{
    public static void main(String[] args){
        String str1 = "Arus";
        String str2 = "ARUS";

        String str3 = new String("ARUS");

        if(str1.equalsIgnoreCase(str3)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}

//------------------------------------------------------------------------------
// Input in String to red one word

import java.util.*;
public class Stringbasic{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);

     String str = sc.next();
     System.out.println(str);
    }
}

//------------------------------------------------------------------------------
// To read the entire line
import java.util.*;
public class Stringbasic{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);

     String str = sc.nextLine();
     System.out.println(str);
    }
}
