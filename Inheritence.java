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

//=================================================================================
// Hirearchical inheritance 
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

class EquilateralTraingle extends Shape{
    public void  area(int l,int h){
        System.out.println(l*h/2);
    }

}

class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}
public class Oops {
    public static void main(String[] args){
        
        Triangle t1 = new Triangle();
        t1.area(34, 66);

        EquilateralTraingle e1 = new EquilateralTraingle();
        e1.area(34, 66);
       
        Circle c1 = new Circle();
        c1.area(5);
    }
}
