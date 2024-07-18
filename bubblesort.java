import java.util.Arrays;

/**
 * bubblesort
 */
public class bubblesort {

    public static void main(String[] args) {
        int[] arr={8,1,3,5,2,7};
        boolean swapped;
        int i,j,temp;
        for(i=0;i<arr.length-1;i++){
            swapped=false;
            for(j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    swapped=true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    System.out.println(Arrays.toString(arr));}
}