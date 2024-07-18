import java.util.Arrays;

public class SelectionSort {
        public static void main(String[] args) {
            int[] arr = {6,2,9,3,9,1};
            int i,j,temp,min;
            
            for(i=0;i<arr.length-1;i++){
                min=i;
                for(j=i+1;j<arr.length;j++){
                    if(arr[j]<arr[min]){
                        min=j;
                    }
                    
                }
                temp=arr[min];
                    arr[min]=arr[i];
                    arr[i]=temp;

            }


        System.out.println(Arrays.toString(arr));}
    
}
