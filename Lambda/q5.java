import java.util.Arrays;

public class q5 {
    public static void main(String[] args) {
        String[] myArray = {"banana", "apple", "Orange", "apricot", "Pineapple"};

        Arrays.sort(myArray, (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase()));

        System.out.println("Sorted array:");
        for (String str : myArray) {
            System.out.println(str);
        }
    }
}

