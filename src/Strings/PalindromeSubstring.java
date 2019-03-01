package Strings;

public class PalindromeSubstring {
    public static void main(String[] args) {
        String inputString = "forgeeksskeegfor";
        findPalindrome(inputString);
    }

    private static void findPalindrome(String inputString) {
        int n = inputString.length();
        boolean table[][] = new boolean[n][n];
        int maxLength = 1;
        int startIndex = 0;

        for (int i = 0; i < n; i++) {
            table[i][i] = true;
            startIndex = i;
        }

        for (int i = 0; i <= n - 2; i++) {
            if (inputString.charAt(i) == inputString.charAt(i + 1)) {
                table[i][i+1] = true;
                startIndex = i;
                maxLength = 2;
            }
        }

        int j;
        for (int k = 3; k <= n; ++k) {
            for (int i = 0; i < n - k +1; i++) {
              j = i + k - 1;
              if (table[i + 1][j - 1] && inputString.charAt(i) == inputString.charAt(j)) {
                  table[i][j] = true;
                  startIndex = i;
                  maxLength = k;
              }
            }
        }
        int endIndex = startIndex + maxLength - 1;
        System.out.println(inputString.substring(startIndex, endIndex + 1));
        System.out.println("palindrome start index = " + startIndex + "end index = " + (startIndex + maxLength - 1));
    }
}