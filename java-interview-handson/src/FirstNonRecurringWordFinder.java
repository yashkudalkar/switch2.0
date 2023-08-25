import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRecurringWordFinder {
    public static void main(String[] args) {
        String paragraph = "This is a test. This is a only test.";
        String firstNonRecurringWord = findFirstNonRecurringWord(paragraph);
        System.out.println("First non-recurring word: " + firstNonRecurringWord);
    }

    private static String findFirstNonRecurringWord(String paragraph) {
        String[] words = paragraph.split("\\s");

        Map<String, Long> wordFrequencies = Arrays.stream(words)
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return Arrays.stream(words)
                .map(String::toLowerCase)
                .filter(word -> wordFrequencies.get(word) == 1)
                .findFirst()
                .orElse("No non-recurring word found.");
    }
}
