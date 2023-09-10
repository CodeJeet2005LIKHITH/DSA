package LECTURES.Rough;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[]arr = {3,7,1,9,5};
        Quick_Sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }
    private static void Quick_Sort(int[]arr,int left,int right){

        if(left >= right){
            return;
        }
        int s = left;
        int e = right;

        int middle = s+(e-s)/2;
        int pivot = arr[middle];

        while(s <= e){
            while(arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }
            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
            Quick_Sort(arr, left, e);
            Quick_Sort(arr, s, right);
        }

}
    }
