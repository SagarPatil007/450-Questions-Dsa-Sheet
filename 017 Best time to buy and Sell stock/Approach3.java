public class Approach3 {
    public static void main(String[] args) {
        int arr[] =   {7,1,5,3,6,4};
        int n = arr.length;

        int maxProfit = 0;
        int minSoFar = arr[0];
        for(int i=0;i<n;i++){
            minSoFar = Integer.min(minSoFar, arr[i]);
            int profit = arr[i]-minSoFar;
            maxProfit = Integer.max(maxProfit, profit);
        }
        System.out.println(maxProfit);
    }
}
