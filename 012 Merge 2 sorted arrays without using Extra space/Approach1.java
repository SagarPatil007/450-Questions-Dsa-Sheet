import java.util.Arrays;

public class Approach1 {
    public static void main(String[] args) {
        int arr1[] = {1, 3, 4, 5};
        int arr2[] = {2, 4, 6, 8};

        int arr3[] = new int[arr1.length+arr2.length];
        mergeArrays(arr1, arr2, arr3);
        
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+ " ");
        }
    }

    public static void mergeArrays(int[] arr1, int[] arr2, int[] arr3) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0, j = 0, k = 0;

        // Traverse arr1 and insert its elements into arr3
        while (i < n1) {
            arr3[k++] = arr1[i++];
        }

        // Traverse arr2 and insert its elements into arr3
        while (j < n2) {
            arr3[k++] = arr2[j++];
        }

        // Sort the entire arr3
        Arrays.sort(arr3);
    }
}