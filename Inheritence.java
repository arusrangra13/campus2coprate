// single level inheritence
import java.util.*;
class Shape{
    public void area(){
        System.out.println("Display area");
    }

}

class Triangle extends Shape{
    public void area(int l , int h){
        System.out.println(l*h);
    }
}

public class Oops {
    public static void main(String[] args){
        
        Triangle t1 = new Triangle();
        t1.area(34, 66);
       
    }
}

//=============================================================================================
//Multi level inheritence
import java.util.*;
class Shape{
    public void area(){
        System.out.println("Display area");
    }

}

class Triangle extends Shape{
    public void area(int l , int h){
        System.out.println(l*h/2);
    }
}

class EquilateralTraingle extends Triangle{
    public void  area(int l,int h){
        System.out.println(l*h/2);
    }

}
public class Oops {
    public static void main(String[] args){
        
        Triangle t1 = new Triangle();
        t1.area(34, 66);

        EquilateralTraingle e1 = new EquilateralTraingle();
        e1.area(34, 66);
       
    }
}
