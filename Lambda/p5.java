@FunctionalInterface
interface EvenChecker {
    boolean isEven(int number);
}

public class p5 {
    public static void main(String[] args) {
        EvenChecker evenChecker = (number) -> number % 2 == 0;

        // Test the lambda expression
        System.out.println("Is 10 even? " + evenChecker.isEven(10));
        System.out.println("Is 7 even? " + evenChecker.isEven(7));
    }
}

