package arrays;

import java.util.Arrays;

public class EquilibriumPoint {
    public static void main(String[] args) {
        int arr[] = {-7, 1, 5, 2, -4, 3, 0};
        equiPoint(arr);

    }

    private static void equiPoint(int arr[]) {
        int leftSum = 0, arrLength = arr.length;
        int rightSum = Arrays.stream(arr).sum();

        for (int i = 0; i < arrLength; i++) {
            rightSum -= arr[i];

            if (leftSum == rightSum) {
                System.out.println("equi point = " + i);
                return;
            }
            leftSum += arr[i];
        }
    }
} 