public class Approach1 {
    public static void main(String[] args) {
        int arr[] = {0,1,2,0,0,1,1,2,2,1};
        
        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid<=high)
        {
            if(arr[mid]==0)
            {   
                // replace element with starting of the array
                int a=arr[mid];
                arr[mid]=arr[low];
                arr[low]=a;
                low++;
                mid++;
            }
            else if(arr[mid]==1)
            {
                // found the element in middle of the array and increase the mid
                mid++;
            }
            else{
                // replace element with ending of array
                int c=arr[mid];
                arr[mid]=arr[high];
                arr[high]=c;
                high--;
            }
        }

        for(int x : arr){
            System.out.print(x+ " ");
        }
    }
}