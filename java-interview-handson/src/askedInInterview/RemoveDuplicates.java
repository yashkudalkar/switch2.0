package askedInInterview;

import java.util.Arrays;
import java.util.stream.Stream;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 3, 5, 6, 7, 1};
        int[] uniqueArray = removeDuplicates(array);
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArray));

        String strArray[] = {"yash", "Kudalkar", "sunil"};
        Arrays.sort(strArray);
        Stream.of(strArray).forEach(s -> System.out.println(s));
    }

    private static int[] removeDuplicates(int[] array) {
        return Arrays.stream(array).distinct().toArray();
    }
}
