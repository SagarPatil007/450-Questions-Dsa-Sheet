public class Approach1 {
    public static void main(String[] args) {
        int arr[]= {-2 -4};
        int n = arr.length;
        int maxSum = arr[0];
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum += arr[j];
            }
            if(sum < 0){
                sum = 0;
            }else{
                maxSum = sum;
            }
        }

        System.out.println(maxSum);
    }
}
