package Strings;

public class StringAnagrams {
    public static void main(String[] args) {
        int arr[] = new int[256];
        char str1[] = {'a', 'b', 'b', 'c', 'd'};
        char str2[] = {'d', 'a', 'x', 'b', 'b'};
        if (str1.length != str2.length) {
            System.out.println("strings are not anagrams");
            return;
        }

        for (char x : str1)
            arr[x] += 1;

        for (char x : str2)
            arr[x] -= 1;

        for (int x : arr) {
            if (!(x == 0)) {
                System.out.println("not anagrams");
                return;
            }
        }
        System.out.println("anagrams");

    }
} 