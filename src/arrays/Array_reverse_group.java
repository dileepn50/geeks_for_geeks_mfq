package arrays;

import java.util.Arrays;

public class Array_reverse_group {
    public static void main(String[] args) {
        int arr[] = {43, 21, 2, 3, 5};
        Arrays.sort(arr);
        for (int i : arr)
            System.out.println(i);
        int k = 3;
//        reverseGroups(arr, k);
    }

    private static void reverseGroups(int arr[], int k) {
        int arrLength = arr.length;
        for (int i = 0; i < arrLength; i = i + k) {
            int right = Math.min(i + k - 1, arrLength - 1);
            while (right >= i) {
                System.out.print(arr[right--] + " ");
            }
        }
    }
} 