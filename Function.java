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
