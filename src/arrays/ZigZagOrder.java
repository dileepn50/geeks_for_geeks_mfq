package arrays;

public class ZigZagOrder {
    public static void main(String[] args) {
        int arr[] = new int[] {4, 3, 7, 8, 6, 2, 1};
        zigZag(arr);
    }

    private static void zigZag(int arr[]) {
        System.out.println("inside zig zag");
        int arrLength = arr.length;
        int i = 0;
        boolean flag= true;
        int temp;
        while (i < arrLength && (i + 1) < arrLength ) {
            if (flag) {
                if (arr[i] > arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            else
            {
                if (arr[i] < arr[i + 1]){
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            i++;
            flag = !flag;
        }

        for (int number : arr)
            System.out.println(number);
    }
} 