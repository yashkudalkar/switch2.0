package basics;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighest {

    public static void printSecondHighest(int[] numbers){
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > highest){
                secondHighest = highest;
                highest = numbers[i];
            } else if(numbers[i] > secondHighest && numbers[i] != highest) {
                secondHighest = numbers[i];
            }
        }
        System.out.println("secondHighest " + secondHighest);
    }

    public static void printSecondHighestNew(int[] numbers){
        System.out.println(Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(-1));
    }

    public static void main(String[] args) {

        int numbers[] = {10, 20, 15, 5, 25, 40};
        printSecondHighest(numbers);
        printSecondHighestNew(numbers);
    }
}
