package arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SortArrayBasedOnOrderHashmap {
    public static void main(String[] args) {
        int arr[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int anoother[] = {2, 1, 8, 3};

        sortArray(arr, anoother);
    }

    private static void sortArray(int arr[], int another[]) {
        int arrLength = arr.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int result[] = new int[arrLength], resultIndex = 0;
        for (int number : arr)
            hashMap.put(number, hashMap.getOrDefault(number, 0) + 1);

        for (int anotherNumber : another) {
            if (hashMap.containsKey(anotherNumber)) {
                int count = hashMap.get(anotherNumber);
                if (count > 0) {
                    int resCount = resultIndex + count;
                    while (resultIndex < resCount) {
                        result[resultIndex++] = anotherNumber;
                    }
                }
            }
            hashMap.remove(anotherNumber);
        }
        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            if ((Integer) mentry.getValue() == 1)
                result[resultIndex++] = (Integer) mentry.getKey();
        }

        for (int number : result)
            System.out.println(number);
    }
} 