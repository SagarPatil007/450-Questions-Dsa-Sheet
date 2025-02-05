public class Approach1 {
    public static void main(String[] args) {
        char str[] = {'s','a','g','a','r'};

        int left = 0;
        int right = str.length-1;

        while(left < right){
            char tmp = str[left];
            str[left] = str[right];
            str[right] = tmp;
            left++;
            right--;
        }

        for(char x : str){
            System.out.print(x + " ");
        }
    }    
}
