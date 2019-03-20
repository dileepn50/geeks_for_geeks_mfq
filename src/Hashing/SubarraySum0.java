package Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class SubarraySum0 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, -7, 3, 4};
        int[] sub = Arrays.copyOfRange(arr, 1, 5);
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int sum = 0;
        int maxSize = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum +arr[i];
            if (hashMap.containsKey(sum)) {
                int prevI = hashMap.get(sum);
                if ((i - prevI + 1) > maxSize) {
                    maxSize = i - prevI + 1;
                    sub = Arrays.copyOfRange(arr, hashMap.get(sum)+1, i + 1);
                }
            }
            else
                hashMap.put(sum, i);
        }

        if (maxSize > 0){
            for (int num : sub)
                System.out.println(num);
        }
        else
        {
            System.out.println("no sub array with 0 sum ");
        }
    }
} 