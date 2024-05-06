import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class q7 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(50, 120, 80, 200, 90);

        List<Integer> filteredList = myList.stream()
                .filter(num -> num > 100)
                .collect(Collectors.toList());

        System.out.println("Numbers greater than 100:");
        System.out.println(filteredList);
    }
}
