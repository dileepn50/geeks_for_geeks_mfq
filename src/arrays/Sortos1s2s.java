package arrays;

import java.util.Arrays;

public class Sortos1s2s {
    public static void main(String[] args) {
        int arr[] = {2, 1, 0, 0, 1, 1, 2, 2, 0, 1, 0, 1};
        sortos1s2s(arr);
    }

    private static void sortos1s2s(int arr[]) {
        int arrLength = arr.length, low = 0, high = arrLength-1;

        while (low < high) {
            while (arr[low] == 0)
                low++;
            while (arr[high] == 1 || arr[high] == 2)
                high--;

//            System.out.println("index = " + low + " first number = " + arr[low]);
//            System.out.println("index = " + high + " second number =" + arr[high]);
//            System.out.println("-------");
            if (high > low) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }

        if (low == high && arr[low] == 0)
            low++;
        high = arrLength - 1;
        while (low < high) {
            while (arr[low] == 1)
                low++;
            while (arr[high] == 2)
                high--;

            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++; high--;
        }

        for (int number : arr)
            System.out.println(number);

    }
} 