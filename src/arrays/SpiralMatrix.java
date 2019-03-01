package arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int arr[][] = {
                {
                    1, 2, 3, 4, 5
                },
                {
                    6, 7, 8, 9, 10
                },
                {
                  11, 12, 13, 14, 15
                }
        };
        spiralTraversal(arr);
    }

    private static void spiralTraversal(int arr[][]) {
        int k = 0, m = arr.length - 1, l = 0, n = arr[0].length - 1;

        while (k <= m && l <= n) {
            for (int index = l; index <= n; index++)
                System.out.print(arr[k][index] + " ");
            k++;
            for (int index = k; index <= m; index++) {
//                System.out.println("n - " + n + "index - " + index);
                System.out.print(arr[index][n] + " ");
            }
            n--;
            if (k <= m) {
                for (int index = n; index >= l; index--) {
//                    System.out.println("n - " + n + "index - " + index);

                    System.out.print(arr[m][index] + " ");
                }

            }
            m--;
            if (l <= n) {
                for (int index = m; index >= k; index--)
                    System.out.print(arr[index][l] + " ");
            }
            l++;

        }

    }
} 