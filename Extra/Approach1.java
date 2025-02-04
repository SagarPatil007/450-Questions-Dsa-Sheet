/*Move all zeros to end of the array */
public class Approach1 {
    public static void main(String[] args) {
        int arr[] = {4,0,4,0, 4,0,0,8, 0};
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            if(arr[left] == 0){
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                right--;
            }else{
                left++;
            }
        }

        for(int x : arr){
            System.out.print(x + " ");
        }
    }
} 