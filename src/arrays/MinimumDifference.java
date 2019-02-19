package arrays;

import java.util.Arrays;

public class MinimumDifference {
    public static void main(String[] args) {
        int arr[] = {3, 4, 1, 9, 56, 7, 9, 12};
        int m = 5;
        minDif(arr, m);
    }

    private static void minDif(int arr[], int m) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE, first = -1, last = -1;
        for (int i = 0; (i + m - 1) < arr.length; i++) {
            int diff = arr[i + m - 1] - arr[i];
            if (diff < min) {
                min = diff;
                first = i;last = i + m - 1;
            }
        }

        System.out.println("min dif = " + min);
        System.out.println("first = " + first);
        System.out.println("second = " + last);
    }
} 