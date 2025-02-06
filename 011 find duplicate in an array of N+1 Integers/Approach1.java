import java.util.HashSet;

public class Approach1 {
    public static void main(String[] args) {
        int arr[] = {1,3,4,2,2};

        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                System.out.println(arr[i]+" ");
            }
            set.add(arr[i]);
        }
    }    
}
