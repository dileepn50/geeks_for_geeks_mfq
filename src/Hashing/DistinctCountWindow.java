package Hashing;

import java.util.HashMap;

public class DistinctCountWindow {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        if (arr.length < k) {
            System.out.println("array is too small");
            return;
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int distinctCount = 0;

        for (int i = 0; i < k; i++){
            if (hashMap.containsKey(arr[i])) {
                int count = hashMap.get(arr[i]);
                hashMap.put(arr[i], ++count);
            }
            else {
                hashMap.put(arr[i], 1);
                distinctCount++;
            }
        }
        System.out.print(distinctCount + " ");
        for (int i = k; i < arr.length; i++) {
            int count = hashMap.get(arr[i - k]);
            if (count == 1) {
                hashMap.remove(arr[i-k]);
                distinctCount--;
            }
            else {
                count--;
                hashMap.put(arr[i - k], count);
            }
            if (hashMap.containsKey(arr[i])) {
                int acount = hashMap.get(arr[i]);
                hashMap.put(arr[i], acount + 1);
            }
            else {
                hashMap.put(arr[i], 1);
                distinctCount++;
            }
            System.out.print(distinctCount + " ");
        }
    }
} 