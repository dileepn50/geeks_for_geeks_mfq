package arrays;

public class PairElements {
    public static void main(String[] args) {
        int arr1[] = {4, 1, 2, 1, 1, 2};
        int arr2[] = {3, 6, 3, 3};

        int sum1 = 0, sum2 = 0;
        for (int number : arr1)
            sum1 += number;
        for (int number : arr2)
            sum2 += number;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                int newsum1 = sum1 - arr1[i] + arr2[j];
                int newsum2 = sum2 - arr2[j] + arr1[i];
                if (newsum1 == newsum2) {
                    System.out.println("pair of number are " + arr1[i] + " and " + arr2[j]);
                    return;
                }

            }
        }

    }
} 