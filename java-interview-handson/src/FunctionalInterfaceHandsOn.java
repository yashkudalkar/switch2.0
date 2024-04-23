import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.Callable;

public class FunctionalInterfaceHandsOn {

    public static void main(String[] args) throws Exception {

     /*   Thread thread = new Thread(() -> {
            System.out.println("runn");
        });
        thread.start();
        */

        String[] strings = {"apple", "banana", "orange", "grape"};

        Arrays.sort(strings, Comparator.comparingInt(String::length));

        for (String fruit :
                strings) {
            System.out.println(fruit);
        }

        Callable<Integer> callableDemo = () -> {
            Integer result = 0;
            for (int i=1; i<= 10;i++) {
                result +=i;
            }
            return result;
        };

        System.out.println("Result: "+ callableDemo.call());

    }
}
