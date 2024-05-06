import java.util.Arrays;
import java.util.List;

public class q10 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(-2, 0, 5, -7, 10, 15, -3, 20);

        long count = myList.stream()
                .filter(num -> num > 0)
                .count();

        System.out.println("Number of elements greater than zero: " + count);
    }
}
