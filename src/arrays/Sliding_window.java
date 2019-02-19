package arrays;

import java.util.Deque;
import java.util.LinkedList;

public class Sliding_window {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 4;
        slidingWindow(arr, k);
    }

    private static void slidingWindow(int arr[], int k) {

        int arrLength = arr.length;
        for (int i = 0; i <= arrLength - k; i++) {
            int subMax = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++) {
                if (arr[j] > subMax)
                    subMax = arr[j];
            }
            System.out.println(subMax);
        }

        Deque<Integer> dq = new LinkedList<>();
        dq.add(12);
        dq.add(23);
        dq.add(5);
        dq.add(6);
        System.out.println(dq.peek());

    }
} 