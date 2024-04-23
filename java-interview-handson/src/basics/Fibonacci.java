package basics;

public class Fibonacci {

    public static void fiboWithoutRecursion(int input) {
        int num1=0;
        int num2=1;

        for (int i = 0; i < input; i++) {
            System.out.print(num1+" ");
            int num3 = num2+num1;
            num1 = num2;
            num2 = num3;
        }
    }

    public static int fiboWithRecursion(int input) {
        if (input<=1)
            return input;

        return fiboWithRecursion(input -1) + fiboWithRecursion(input -2);

    }

    public static void main(String[] args) {
        System.out.println("Fibonacci without recursion");
        fiboWithoutRecursion(10);
        System.out.println();
        System.out.println("Fibonacci with recursion");
        for (int i = 0; i < 10; i++) {
            System.out.print( fiboWithRecursion(i)+" ");
        }

    }
}
