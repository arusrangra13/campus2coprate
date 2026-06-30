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
