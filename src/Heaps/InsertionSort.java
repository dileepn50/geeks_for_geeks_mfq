package Heaps;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 10, 12, 1, 5, 6};
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }


        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

    }
}