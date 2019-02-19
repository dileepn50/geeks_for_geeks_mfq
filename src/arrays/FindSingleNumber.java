package arrays;

public class FindSingleNumber {
    public static void main(String[] args) {
        int arr[] = {1, 1, 3, 3, 4, 5, 5, 7, 7, 8, 8};
        singleNumber(arr, 0, arr.length);
    }

     static void singleNumber(int arr[], int low, int high) {
        if (low == high) {
            System.out.println("single element is = " + arr[low]);
            return;
        }
        int mid = (low + high) / 2;
        if (mid % 2 == 0) {
            if (arr[mid] == arr[mid + 1])
                singleNumber(arr, mid + 2, high);
            else
                singleNumber(arr, low, mid);
        }
        else {
            if (arr[mid-1] == arr[mid])
                singleNumber(arr, mid + 1, high);
            else
                singleNumber(arr, low, mid-1);
        }

    }
} 