import java.util.HashMap;
import java.util.Map;

public class Approach1 {
    public static void main(String[] args) {
        String str = "test string"; 

        Map<Character,Integer> mp = new HashMap<>();

        for(int i=0;i<str.length();i++){
            mp.put(str.charAt(i), mp.getOrDefault(str.charAt(i), 0)+1);
        }

        for (Map.Entry<Character,Integer> entry : mp.entrySet()) {
            if(entry.getValue() > 1){
                System.out.println(entry.getKey()+ " "+entry.getValue());
            }
        }
    }    
}
