public class Approach2 {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "cdab";

        // a = abcdabcd  b = cdab
        a = a + a;

        if(a.contains(b)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }    
}
