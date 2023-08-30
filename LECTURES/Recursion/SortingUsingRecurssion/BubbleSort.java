package LECTURES.Recursion.SortingUsingRecurssion;

import java.util.Arrays;

public class BubbleSort {
   public static void main(String[] args) {
        int[]arr = {5,4,3,2,1};
       Bubble_Sort(arr,0,arr.length-1);   
       System.out.println(Arrays.toString(arr));
     }

   private static void Bubble_Sort(int[] arr,int start,int end) {
    // Pattern same as Printing star pattern
    if(end == 0){
        return;
    }
    if(end > start){
        if(arr[start] > arr[start+1]){
            int temp = arr[start];
            arr[start] = arr[start+1];
            arr[start+1] = temp;
            Bubble_Sort(arr, ++start, end);
        }
        else{
            Bubble_Sort(arr, start+1, end);
        }
    }
    else{
        Bubble_Sort(arr, 0, --end);
    }
    
   }

}
