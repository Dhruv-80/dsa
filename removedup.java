import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class removedup {
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        ArrayList<Integer> arr1 = new ArrayList<>(set);
        System.out.println(arr1);
        int k=arr.length - set.size();
        System.out.println(k);
    }
        
    }
    
