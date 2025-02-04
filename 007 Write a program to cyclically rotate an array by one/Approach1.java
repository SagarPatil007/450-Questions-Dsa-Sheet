public class Approach1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length-1;
        int x = arr[n];
        for(int i =n;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = x;

        for(int y : arr){
            System.out.print(y + " ");
        }
    }
}
