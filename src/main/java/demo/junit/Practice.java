package demo.junit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {

    public static List<Integer> printFibonacciSeries(int startValue, int limit) {
        final List<Integer> lstFibSeries = new ArrayList<>();
        Stream.iterate(new Integer[]{startValue, startValue}, p -> new Integer[]{p[1], p[0] + p[1]})
                .limit(limit).forEach(e -> lstFibSeries.add(e[0]));
        return lstFibSeries;
    }

    public static boolean isPalindrome(String originalString) {

        String tempString = originalString.replaceAll("\\s+", "").toLowerCase();

        return IntStream.range(0, tempString.length() / 2)
                .noneMatch(i -> tempString.charAt(i) != tempString.charAt(tempString.length() - i - 1));

    }

    public static boolean isAnagram(String input1, String input2) {
        char[] arr1 = input1.replaceAll("\\s+", "").toLowerCase().toCharArray();
        char[] arr2 = input2.replaceAll("\\s+", "").toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return (Arrays.equals(arr1, arr2));
    }

    public static void main(String[] args) {
        System.out.println(printFibonacciSeries(1, 10));
        System.out.println(isPalindrome("Rotor"));
        System.out.println(isPalindrome("Motor"));
        System.out.println(isAnagram("Peek", "Keep"));
    }
}
