package basics;

public class PrimeNumber {

    public static boolean isPrime(int input) {
        if (input <= 1)
            return false;
        double sqrt = Math.sqrt(input);
        System.out.println(sqrt);
        for (int i = 2; i <= sqrt; i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 17;
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

    }
}
