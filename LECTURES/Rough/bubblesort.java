package LECTURES.Rough;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[]arr = {8,2,3,4,5,6,7};
        bubble_sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    private static void bubble_sort(int[]arr,int start,int end){
        if(end == 0){
            return;
        }
        if(end > start){
            if(arr[start] > arr[start+1]){
                int temp = arr[start];
                arr[start] = arr[start+1];
                arr[start+1] = temp;
                bubble_sort(arr, start+1, end);
            }
            else{
                bubble_sort(arr, start+1, end);
            }
            
        }
        else{
            bubble_sort(arr, start+1, --end);
        }
}
    
}
