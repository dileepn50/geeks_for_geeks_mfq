package arrays;

import java.util.Arrays;

public class SortArrayBasedOnOrder {
    public static void main(String[] args) {
        int arr[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int m =arr.length;
        int second[] = {2, 1, 8, 3};

        int result[] = new int[arr.length];
        int visited[] = new int[arr.length];

        Arrays.sort(arr);
        int i = 0;
        for (int number : second) {
            int leftPosition = leftMostKey(arr, 0, m, number);
            for (int j = leftPosition; arr[j] == number; j++) {
                visited[j] = 1;
                result[i++] = number;
            }
        }

        for (int j = 0; j < m; j++) {
            if (visited[j] == 0) {
                result[i++] = arr[j];
            }
        }
        for (int res : result)
            System.out.println(res);

    }

    private static int leftMostKey(int arr[], int low, int high, int key) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if ( (mid == 0 && arr[mid] == key) || (arr[mid] == key && arr[mid - 1] != key))
                return mid;
            if (key > arr[mid])
                return leftMostKey(arr, mid + 1, high, key);
            return leftMostKey(arr, low, mid - 1, key);
        }
        return -1;
    }
} 