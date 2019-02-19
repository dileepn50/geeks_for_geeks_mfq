package arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = {3, 4, 6, 1, 5, 8, 7};
        getMissingNumber(arr);
    }

    private static void getMissingNumber(int arr[]) {
        int exor1 = 1;
        for (int i = 2; i <= arr.length + 1; i++)
            exor1 = exor1 ^ i;

        int exor2 = arr[0];
        for (int i = 1; i < arr.length; i++)
            exor2 = exor2 ^ arr[i];

        System.out.println(exor1 ^ exor2);


    }
} 