package arrays;

import java.util.*;

import static java.util.Map.Entry.comparingByValue;

public class SortFrequency {
    public static void main(String[] args) {
        int arr[] = {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12};
        sortFrequency(arr);
    }

    private static void sortFrequency(int arr[]) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int count = hashMap.getOrDefault(arr[i], 0);
            hashMap.put(arr[i], count + 1);
        }

        Set<Map.Entry<Integer, Integer>> entrySet = hashMap.entrySet();
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(entrySet);
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        int result[] = new int[arr.length], r = 0;
        for (Map.Entry<Integer, Integer> listObject : list) {
            int key = listObject.getKey();
            int value = listObject.getValue();
            for (int i = 0; i < value; i++)
                result[r++] = key;
        }
        for (int number: result)
            System.out.print(number + " ");

    }
}
