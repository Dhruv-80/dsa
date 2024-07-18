import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3; // Number of positions to rotate
        
        int n = arr.length;
        
        // Create temporary arrays for the parts to be rotated
        int arr1[] = Arrays.copyOfRange(arr, k, n);
        int arr2[] = Arrays.copyOfRange(arr, 0, k);
        
        // Calculate the lengths of the temporary arrays
        int arrlen1 = arr1.length;
        int arrlen2 = arr2.length;
        
        // Create a result array to store the rotated array
        int result[] = new int[n];
        
        // Copy elements from arr1 to result starting from index 0
        System.arraycopy(arr1, 0, result, 0, arrlen1);
        
        // Copy elements from arr2 to result starting from index arrlen1
        System.arraycopy(arr2, 0, result, arrlen1, arrlen2);
        
        // Print the rotated array
        System.out.println("Rotated array: " + Arrays.toString(result));
    }
}
