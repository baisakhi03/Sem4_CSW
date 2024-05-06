import java.util.Arrays;
import java.util.List;

public class q2 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5);

        int sum = myList.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Sum of the list: " + sum);
    }
}
