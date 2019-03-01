package Strings;

public class LargestCommonSubstring {
    public static void main(String[] args) {
       String x = "89231";
        char y[] = x.toCharArray();
        int power = 0;
        long result = 0;
        for (int i = y.length - 1; i >= 0; i--) {
            long value = Math.round(Math.pow(10, power++));
            result = result + (y[i] - '0') * value;
        }

        System.out.println(result);
    }
} 