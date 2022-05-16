package demo.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PracticeTest {

    @Test
    @DisplayName("fibonacci")
    void printFibonacciSeries() {
        Integer list[] = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        List<Integer> targetList = new ArrayList<Integer>();
        Arrays.stream(list).forEach(e -> targetList.add(e));
        List<Integer> testList = Practice.printFibonacciSeries(1, 10);
        assertEquals(targetList, testList,
                "Fibonacci Series Code works");
    }

    @Test
    @DisplayName("palindrome")
    void isPalindrome() {
        String test="Rotor";
        assertEquals(true, Practice.isPalindrome(test),
                "Plaindrome check works");
    }

    @Test
    @DisplayName("anagram")
    void isAnagram() {
        String input1="Keep";
        String input2="Peek";
        assertEquals(true, Practice.isAnagram(input1, input2),
                "Anagram check works");
    }
}