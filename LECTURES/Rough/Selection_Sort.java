package LECTURES.Rough;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[]arr = {1, 9, 81, 18, 63, 27, 45, 36, 54, 72, 90};
        selectionSort(arr,0,arr.length-1,0);
        System.out.println(Arrays.toString(arr));

    }
    private static void selectionSort(int[]arr,int start,int end,int greatest){
        
        if(end == 0){
            return;
        }
        if(start <= end){
            if(arr[start] > arr[greatest]){
                selectionSort(arr, start+1, end, start);

            }
            else{
                selectionSort(arr, start+1, end, greatest);
            }

        }
        else{
            int temp = arr[greatest];
            arr[greatest] = arr[end];
            arr[end] =temp;
            selectionSort(arr, 0, --end, 0);
        }

    }

}
