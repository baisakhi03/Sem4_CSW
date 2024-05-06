import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class q8 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(5, 10, 15, 20, 25);

        List<Integer> filteredList = myList.stream()
                .map(num -> num * num) // Square each number
                .filter(num -> num > 100) // Filter out numbers greater than 100
                .collect(Collectors.toList());

        System.out.println("Squares greater than 100:");
        System.out.println(filteredList);
    }
}
