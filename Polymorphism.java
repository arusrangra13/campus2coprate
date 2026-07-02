// ===========================================================================================================
// Function overloading
import java.util.*;

class Student {
    String name;
    int age;
    int rollNumber;
    int marks;

    // 1 parameter
    public void printInfo(String name) {
        System.out.println(name);
    }

    // 3 parameters
    public void printInfo(int age, int rollNumber, int marks) {
        System.out.println(age + " " + rollNumber + " " + marks);
    }

    // No parameters
    public void printInfo() {
        System.out.println(name + " " + age + " " + rollNumber + " " + marks);
    }

    // 4 parameters
    public void printInfo(String name, int age, int rollNumber, int marks) {
        System.out.println(name + " " + age + " " + rollNumber + " " + marks);
    }
}

public class Oops {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Arush Rangra";
        s1.age = 20;
        s1.rollNumber = 101;
        s1.marks = 90;

        // Calling overloaded methods
        s1.printInfo();                             // No parameters
        s1.printInfo(s1.name);                      // 1 parameter
        s1.printInfo(s1.age, s1.rollNumber, s1.marks); // 3 parameters
        s1.printInfo(s1.name, s1.age, s1.rollNumber, s1.marks); // 4 parameters
    }
}
