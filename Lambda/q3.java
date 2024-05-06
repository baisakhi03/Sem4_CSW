import java.util.Arrays;
import java.util.List;

public class q3 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 7, 3, 9, 5);

        Integer maxNumber = myList.stream().max(Integer::compareTo).orElse(null);

        System.out.println("Maximum number in the list: " + maxNumber);
    }
}
