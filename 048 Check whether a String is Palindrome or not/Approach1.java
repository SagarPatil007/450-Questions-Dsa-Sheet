public class Approach1 {
    public static void main(String[] args) {
        String s = "TEST";
        boolean flag = false;
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                flag = true;
            }
            left++;
            right--;
        }
        if(!flag){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }    
}
