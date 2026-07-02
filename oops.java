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
import java.util.*;

class Pen{
    String color;
    String brand;
    int price;

    public void display(){
        System.out.println("Hlo my name is Arus Rangra");
    }
    public void printColor(){
        System.out.println(this.color);
    }

    public void printBrand(){
        System.out.println(this.brand);
    }
    public int printPrice(){
        System.out.println(this.price);
        return this.price;

    }
}
public class Oops {
    public static void main(String[] args){

        Pen pen1 = new Pen();
        pen1.color = "yellow";
        pen1.brand="ratio";
        pen1.price=10;

        Pen pen2 = new Pen();
        pen2.color = "red";
        pen2.brand="Natraj";
        pen2.price=20;

        pen1.display();
        pen1.printColor();
        pen2.printColor();
        pen1.printBrand();
        pen2.printBrand();
        pen1.printPrice();
        pen2.printPrice();
    }
}

//===========================================================================
import java.util.*;

    class Student {
        String name;
        int age;
        int rollNumber;
        int marks;

        public void printName(){
            System.out.println(this.name);
        }

        public int printAge(){
            System.out.println(this.age);
            return age;
        }

        public int printRollNumber(){
            System.out.println(this.rollNumber);
            return rollNumber;
        }
        public int printMarks(){
            System.out.println(this.marks);
            return marks;
        }

    }

public class Oops {
    public static void main(String[] args){
        Student s1 = new Student();

        s1.name = "Arus rangra";
        s1.age = 20;
        s1.rollNumber = 2330076;
        s1.marks = 70;

        s1.printName();
        s1.printAge();
        s1.printRollNumber();
        s1.printMarks();
    }
}

// ==================================================================================================
// Parametrize constructer

import java.util.*;

    class Student {
        String name;
        int age;
        int rollNumber;
        int marks;

        public void printAllInfo(){
            System.out.println("Name os Student:"+name);
            System.out.println("Age of Student:"+age);
            System.out.println("Roll Number of Student:"+rollNumber);
            System.out.println("Marks of Student:"+marks);
            
        }
        
        Student(String name,int age,int rollNumber,int marks){
            this.name = name;
            this.age = age;
            this.rollNumber = rollNumber;
            this.marks = marks;
        }
    }

public class Oops {
    public static void main(String[] args){
        Student s1 = new Student("Arus Rangra", 20,21,90);

        s1.printAllInfo();
        
    }
}

// ==================================================================================================
// 2>Parametrize constructer

import java.util.*;

class MarutiCar{
    String type;
    String name;
    String color;
    int price;

    public void printAllInfoOfCar(){
        System.out.println("Type of car is:"+type);
         System.out.println("Name of car is:"+name);
          System.out.println("color of car is:"+color);
           System.out.println("Price of car is:"+price);
    }
    MarutiCar(String type,String name, String color ,int price){
        this.type = type;
        this.name = name;
        this.color = color;
        this.price =price;
    }


}
public class Oops {
    public static void main(String[] args){
        MarutiCar c1 = new  MarutiCar("sedan","Swift dizre","Silver grey",600000);

        c1.printAllInfoOfCar();
    }
}

