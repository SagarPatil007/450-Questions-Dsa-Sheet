import java.util.HashSet;

public class Approach1 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5}, b[] = {1, 2, 3};
        HashSet<Integer> hs=new HashSet<>();
        
        for(int i=0;i<a.length;i++){
            hs.add(a[i]);
        }
        
        for(int i=0;i<b.length;i++){
            hs.add(b[i]);
        }

        for(Integer x : hs){
            System.out.print(x + " ");
            System.out.println();
        }
        
        System.out.println(hs.size()); 
    }
}
