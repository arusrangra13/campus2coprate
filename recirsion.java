//print number 5 to 1

import java.util.*;
public class recursion{
    public static void printNumb(int n){
        if(n==0){
          return ;
        }
        System.out.println(n);
        printNumb(n-1);
    }

    public static void main(String[] args){
        int n = 5;
        printNumb(n);

    }

}
     

//====================================================================
//print number 1 to 5
import java.util.*;
public class recursion{
    public static void printNumb(int n){
        if(n==6){
          return ;
        }
        System.out.println(n);
        printNumb(n+1);
    }

    public static void main(String[] args){
        int n = 1;
        printNumb(n);

    }

}
     

