import java.util.*;

public class conditionalst {
    public static void main(String[] args) {

        int Attendence = 45;
        if (Attendence >= 95) {
            System.out.println("Student get internal of 5 marks more");
        } else if (Attendence >= 75) {
            System.out.println("Student can sit in exam in all exam ");
        } else if (Attendence >= 50) {
            System.out.println("Student is detane in one exam ");
        } else if (Attendence <= 50) {
            System.out.println("Detane from all exam ");
        }
    }
}
