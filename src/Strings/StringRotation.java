package Strings;

public class StringRotation {
    public static void main(String[] args) {
        String str1 = "amazon";
        String str2 = "aoznam";

        int k = 2;

        if (str2.equals(str1.substring(k, str1.length()) + str1.substring(0, k)) || str2.equals(str1.substring(str1.length() - k) + str1.substring(0, str1.length() - k))) {
            System.out.println("str2 is rotation of str1");
            return;
        }
        System.out.println("str2 is not a rotation of str1");
    }
} 