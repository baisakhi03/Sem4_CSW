import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class q4 {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("apple", "banana", "orange", "apricot", "pineapple");
        String prefix = "ap";

        List<String> filteredList = myList.stream()
                .filter(s -> s.startsWith(prefix))
                .collect(Collectors.toList());

        System.out.println("Filtered list: " + filteredList);
    }
}
