import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class q6 {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("banana", "apple", "orange", "apricot", "pineapple");

        List<String> upperCaseList = myList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("List with uppercase equivalence:");
        System.out.println(upperCaseList);
    }
}
