import java.util.*;

public class p3 {
    public static void main(String[] args) {
        // Original map
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("p1", 25);
        ageMap.put("p2", 30);
        ageMap.put("p3", 40);

        // Transforming the map
        Map<String, Integer> updatedAgeMap = new HashMap<>();
        ageMap.forEach((name, age) -> updatedAgeMap.put(name, age + 10));

        // Printing the updated map
        System.out.println(updatedAgeMap);
    }
}
