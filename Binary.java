// wap a progarm to find the fist transtion point in binary search array

import java.util.*;

public class Binary {
    public static int transitionPoint(int[] arr) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == 1) {
                ans = mid;
                high = mid - 1; // search left for first 1
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(transitionPoint(arr));
    }
}
