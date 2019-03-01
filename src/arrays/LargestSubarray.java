package arrays;

public class LargestSubarray {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 1};
        largestSubarray(arr);
    }

    private static void largestSubarray(int arr[]) {
        int sum = 0;
        int arrLength = arr.length;
        int maxSize = -1;
        int startIndex = -1, endIndex = -1;

        for (int i = 0; i < arrLength; i++) {
            sum = arr[i] == 0 ? -1: 1;
            for (int j = i + 1; j < arrLength; j++) {
                sum += (arr[j] == 0 ? -1 : 1);

                if (sum == 0) {
                    int size = j - i + 1;
                    if (size > maxSize) {
                        maxSize = size;
                        startIndex = i;
                        endIndex = j;
                    }
                }
            }
        }
        if (maxSize == -1)
            System.out.println("sub array is not present");
        else
            System.out.println(String.format("sub array is found at = %d and %d ", startIndex, endIndex));
    }
} 