package arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {5, 18, 37, 48,51, 74, 82, 93, 95};
        binarySearch(arr, 0, arr.length, 5);
    }

    private static void binarySearch(int arr[], int low, int high, int key) {
        int mid = (low + high) / 2;
        if (low > high) {
            System.out.println("element is not present");
            return;
        }
        if (arr[mid] == key) {
            System.out.println(String.format("element found at %d ", mid));
            return;
        }

        if (key > arr[mid])
            binarySearch(arr, mid + 1, high, key);
        if (key < arr[mid])
            binarySearch(arr, low, mid - 1, key);
    }
} 