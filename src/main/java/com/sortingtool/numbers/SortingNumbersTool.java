package com.sortingtool.numbers;

import java.util.*;


public class SortingNumbersTool {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Long> numbersList = new ArrayList<>();

        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            numbersList.add(number);

        }
        int count = numbersList.size();
        long maxValue = Collections.max(numbersList);
        int countMax = Collections.frequency(numbersList, maxValue);

        System.out.printf("Total numbers: %s. "  + "\n" +
                "The greatest number: %s (%s time(s)).", count, maxValue, countMax);



    }
}
