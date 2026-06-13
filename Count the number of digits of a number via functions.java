import java.util.*;

public class Normaloperators {

    static int iDigits(int num) {
        int i = 0;

        while (num > 0) {
            i++;
            num = num / 10;
        }
        return i;
    }

    public static void main(String[] args) {
        int num = 1732;
        System.out.println("Number of digits=" + iDigits(num));
    }
}
