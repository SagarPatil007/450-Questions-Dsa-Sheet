public class Approach1 {
    public static void main(String[] args) {
        int arr[] =   {7,1,5,3,6,4};
        int n = arr.length;

        int profit = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                profit = Integer.max(profit, arr[j]-arr[i]);
            }
        }

        System.out.println(profit);
    }
}