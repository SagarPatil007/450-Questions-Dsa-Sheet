public class Approach2 {
    public static void main(String[] args) {
        String str = "ABA";

        StringBuilder sb  = new StringBuilder(str);

        if(str.equals(sb.reverse().toString())){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }    
}
