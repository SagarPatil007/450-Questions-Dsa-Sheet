public class Approach2 {
    public static void main(String[] args) {
        int arr[] =   {7,1,5,3,6,4};
        int n = arr.length;
        int aux[] = new int[n];
 
        int profit = 0;
        int max = 0;
        for(int i=n-1;i>=0;i--){
            aux[i] = Integer.max(max, arr[i]);
            max = aux[i];
        }

        for(int i=0;i<n;i++){
            profit = Integer.max(profit, aux[i]-arr[i]);
        }

        System.out.println("answer is :"+profit);
    }
}