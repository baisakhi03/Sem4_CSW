import java.util.*;

public class p2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("orange");
        strings.add("grape");
        strings.add("kiwi");

        strings.sort((a, b) -> a.length() - b.length());

        System.out.println(strings);
    }
}

