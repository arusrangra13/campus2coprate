import java.util.*;
public class Functions {
    public static void printName(String name) {
        System.out.println(name);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printName(name);

    }
}

//=================================================================

import java.util.*;
public class Functions {
    public static int calculateSum(int a ,int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a,b);
        System.out.println("sum of 2 numbers:"+sum);

    }
}

//=====================================================================
//practice
import java.util.*;
public class Functions {
    public static void nameOfStudent(String name){
        System.out.println(name);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        nameOfStudent(name);
    }
}

//=====================================================================
//Multiple of three
import java.util.*;
public class Functions {
    public static int calculateSum(int a ,int b,int c){
        int mul = a*b*c;
        return mul;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int mul = calculateSum(a,b,c);
        System.out.println("mul of three no:"+ mul);

    }
}
//=====================================================================

import java.util.*;
public class Functions {
    public static int calculateSum(int a ,int b,int c){
        int mul = a*b*c;
        return mul;
    }
      public static void childName(String name){
        System.out.println(name);
      }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
         int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        childName(name);

        int mul = calculateSum(a,b,c);
        System.err.println("mul of three no:"+mul);
     
    }
        
}

//=====================================================================

import java.util.*;
public class Functions {
    public static int calculateSum(int a ,int b,int c){
        int mul = a*b*c;
        return mul;
    }
      public static void childName(String name){
        System.out.println(name);
      }

      public static void StudentsNames(String names){
        System.out.println(names);
      }

      public static int Sum(int i, int j, int k){
        int Sum = i+j+k;
        return Sum;
      }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // name
        String name = sc.nextLine();
        childName(name);
        // mul
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mul = calculateSum(a,b,c);
        System.out.println("mul of three no:"+mul);
        sc.nextLine();  
        // names
        String names = sc.nextLine();
        StudentsNames("Students names:"+names);
        // Sum
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int Sum = Sum(i,j,k);
        System.out.println("Sum of four no:"+Sum);

    }
        
}

