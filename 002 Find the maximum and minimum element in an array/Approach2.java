import java.util.Arrays;
import java.util.List;

public class Approach2 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,8);
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<ls.size();i++){
            if(ls.get(i) > max){
                max = ls.get(i); 
            }
            if(ls.get(i) < min){
                min = ls.get(i); 
            }
        }

        System.out.println("Max is :"+max);
        System.out.println("Min is :"+min);
    }
}
