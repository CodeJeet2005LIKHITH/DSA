package LECTURES.Recursion.SortingUsingRecurssion;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 9, 2, 1};
        Quick_Sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    private static void Quick_Sort(int[] arr, int start, int end) {
        if(start >= end){
            return;
        }
        int s=start;
        int e = end;
        int middle = s+(e-s)/2;
        int pivot = arr[middle];
        while(s <= e){
            while(arr[s] < pivot){
                ++s;
            }
            while(arr[e] > pivot){
                --e;
            }
            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                ++s;
                --e;

            }

        }
        Quick_Sort(arr, start, e);
        Quick_Sort(arr, s, end);
 
    
}
}
