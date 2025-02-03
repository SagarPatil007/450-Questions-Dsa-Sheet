import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Approach1 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(4,68,48,14,6,46,6,5,11);
        int k = 2;
        int n = ls.size();
        Collections.sort(ls);
        System.out.println(ls.get(k-1));
        System.err.println(ls.get(n-k));
        
    }
}
