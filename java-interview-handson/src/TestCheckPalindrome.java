import java.util.function.Predicate;

public class TestCheckPalindrome {

    public static boolean checkPalindrome(int number) {
        int ogNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            int temp = number % 10;
            reversedNumber = reversedNumber * 10 + temp;
            number /= 10;
        }
        return ogNumber == reversedNumber;
    }

    public static boolean checkPalindrome(String input) {
        Predicate<String> stringPredicate = s -> new StringBuilder(s).reverse().toString().equalsIgnoreCase(s);
        return stringPredicate.test(input);
    }

    public static void main(String[] args) {
        System.out.println("Case 1 : 12321 is Palindrome "+ checkPalindrome(12321));
        System.out.println("Case 2 : 566 is Palindrome "+ checkPalindrome(566));

        System.out.println("Case 3 : String is Palindrome (Radar) "+ checkPalindrome("Madam"));
        System.out.println("Case 3 : String is Palindrome (Yash) "+ checkPalindrome("Yash"));
    }
}
