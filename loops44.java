// Skip 99 here from 1 to 101
public class conditionalst {
    public static void main(String[] args) {
        // int i = 10;
        for (int i = 0; i < 101; i++) {

            if (i == 99) {
                continue;
            }
            System.out.println(i);
        }
    }
}
