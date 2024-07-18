import java.util.*;

public class checksort{
    public static void main(String[] args) {
        int arr[] = {1,2,3,6,5};
        boolean result = check(arr);
        if(result){
            System.out.println("sorted");
        }
        else{
            System.out.println("unsorted");
        }

            

        }


        public static boolean check(int[] arr){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>arr[i+1]){
                    return false;
                }
            }
                return true;
}
}
        

        
