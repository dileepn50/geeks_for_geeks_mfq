package arrays;

public class Subarray_with_given_sum {
    public static void main(String[] args) {
        int arr[] = {15, 2, 13, 7, 9, 5, 10, 23};
        int sum = 4;
        subArraySum(arr, sum);
    }

    private static void subArraySum(int arr[], int sum) {
        int arrayLength = arr.length;
        for (int i =0; i < arrayLength; i++) {
            int currentSum = arr[i];
            for (int j = i + 1; j < arrayLength; j++) {
                currentSum += arr[j];
                if (currentSum == sum) {
                    System.out.println("element found from " + i + " to " + j);
                    return;
                }
                if (currentSum > sum)
                    break;
            }
        }

        System.out.println("sum is not present in the array");
    }
} 