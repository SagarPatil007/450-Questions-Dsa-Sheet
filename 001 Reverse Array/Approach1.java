/* Reverse the array using primitive data types  */
public class Approach1{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Utils utils = new Utils();
        utils.reverse(arr);
    }
}
class Utils{
    void reverse(int []arr){
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start<end){
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
