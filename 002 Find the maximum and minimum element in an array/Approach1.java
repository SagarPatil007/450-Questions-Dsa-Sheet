import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Approach1 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println(Collections.max(ls));
        System.out.println(Collections.min(ls));
    }
}
