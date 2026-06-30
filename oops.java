// First oops code
import java.util.*;

class Pen{
    String color;
    String type; // Ballpen or Gel pen

    public void write(){
        System.out.println("Writng my name Arus Rangra");

    }
}
public class Oops {
    public static void main(String[] args){
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write();
    }
    
}

// =================================================================================
//car Example
import java.util.*;

class Car{
    String color;
    String type; // Sedan or Suv

    public void display(){
        System.out.println("it is a Sedan car");

    }
}
public class Oops {
    public static void main(String[] args){
        Car Car1 = new Car();
        Car1.color = "blue";
        Car1.type = "Sedan";

        Car1.display();
    }
    
}
// =================================================================================
