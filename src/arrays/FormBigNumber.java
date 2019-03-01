package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FormBigNumber {
    public static void main(String[] args) {
        List<String> numberList = new ArrayList<>();
        numberList.add("92");
        numberList.add("345");
        numberList.add("56");
        numberList.add("71");
        numberList.add("82");
        numberList.add("5");
        numberList.add("67");
        numberList.add("81");

        formBigNumber(numberList);
    }

    private static void formBigNumber(List<String> numberList) {
        System.out.println(numberList);
        Collections.sort(numberList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String firstString = o1 + o2;
                String secondString = o2 + o1;
                return firstString.compareTo(secondString) > 0 ? -1 : 1;

            }
        });

        System.out.println(numberList);
    }
} 