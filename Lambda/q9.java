import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class q9 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Hello", " ", "world", "!");

        String concatenatedString = stringList.stream()
                .collect(Collectors.joining());

        System.out.println("Concatenated string: " + concatenatedString);
    }
}
