import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> Numbers=numbers.stream().filter(n->n<10).collect(collectors.toList);
       

        System.out.println(Numbers);
    }
}
