package askedInInterview;

import java.util.Arrays;
import java.util.List;

public class ReverseVowels {

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));     // Output: "holle"
        System.out.println(reverseVowels("leetcode"));  // Output: "leotcede"
    }

    private static String reverseVowels(String input) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

        char[] charArray = input.toCharArray();

        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            while (left < right && !vowels.contains(charArray[left])) {
                left++;
            }
            while (left < right && !vowels.contains(charArray[right])) {
                right--;
            }
            if (left < right) {
                char temp = charArray[right];
                charArray[right] = charArray[left];
                charArray[left] = temp;
                left++;
                right--;
            }
        }

        return new String(charArray);
    }
}
