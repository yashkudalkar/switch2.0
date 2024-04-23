package basics;

public class EvenOdd {

    public static boolean isEven(int input) {
        if (input % 2 == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 5;
        if (isEven(number))
            System.out.println("even");
        else
            System.out.println("odd");
    }
}
