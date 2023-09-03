package LECTURES.Rough;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[]arr = {3,7,1,9,5};
        Quick_Sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }
    private static void Quick_Sort(int[]arr,int start,int end){
        if(start >= end){
            return;
        }
        int s = start;
        int e = end;
        int middle = start+(end-start)/2;
        int pivot = arr[middle];
        while(arr[s] > pivot){
            s++;
        }
        while(arr[e] < pivot){
            e--;
        }
        if(s <= e){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        Quick_Sort(arr, start, end);
        Quick_Sort(arr, start+1, end);
    }
}
