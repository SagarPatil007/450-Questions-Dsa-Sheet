/* Reverse the array using non-primitive data types  */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Approach2 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7);
        Collections.reverse(ls);
        System.out.println(ls);
    }
}
