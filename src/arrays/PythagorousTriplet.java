package arrays;

import java.util.Arrays;

public class PythagorousTriplet {
    public static void main(String[] args) {
        int arr[] = {8, 1, 7, 25, 26, 24, 5};
        int arrLength = arr.length;
        for (int i = 0; i < arrLength; i++)
            arr[i] = arr[i] * arr[i];

        Arrays.sort(arr);
        int low, high;
        for (int i = arrLength - 1; i >= 2; i--) {
            low = 0;
            high = i - 1;
            while (low < high) {
                if (arr[low] + arr[high] == arr[i]) {
                    System.out.println(arr[low] + "  " + arr[high] + "  " + arr[i]);
                    return;
                }
                if (arr[low] + arr[high] < arr[i]) low++;
                else high--;
            }

        }

    }
} 