public class Approach1 {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "cdab";
        System.out.println(areRotations(a, b));
    } 
    
    static boolean areRotations(String s1, String s2) {
        for(int i=0;i<s1.length();i++){
            if(s1.equals(s2)){
                return true;
            }
            // extract the last char
            char last = s1.charAt(s1.length()-1);
            // make new string like (last char + star to n-1 char) and assign to s1
            s1 = last + s1.substring(0, s1.length()-1);
        }
        return false;
    }
}
