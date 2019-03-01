package Strings;

import java.util.ArrayList;
import java.util.List;

public class ReverseWords {
    public static void main(String[] args) {
        String inputString = "We love java programming";
        reverseWords(inputString);
    }

    private static void reverseWords(String inputString) {
        int stringLength = inputString.length();
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < stringLength){
            for (int j = i + 1; j <= stringLength; j++) {
                if ((j == stringLength) || inputString.charAt(j) == ' ') {
                    result.add(inputString.substring(i, j));
                    i = j + 1;
                    break;
                }
            }
        }
        int index = result.size() - 1;
        while (index >= 0)
            System.out.println(result.get(index--));
    }
} 