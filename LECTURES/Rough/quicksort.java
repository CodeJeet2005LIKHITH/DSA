package LECTURES.Rough;

import java.util.Arrays;

public class quicksort {
    
    public static void main(String[] args) {
        int[]arr = {8,9,2,5,1,4,3};
        qs(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    private static void qs(int[]arr,int start,int end){
        if(start >= end){
            return;
        }
        int middle = start+(end-start)/2;
        int pivot = arr[middle];
        int left = start;
        int right = end;

        while(left <= right){
        while(arr[left] < pivot){
            left++;
        }
        while(arr[right] > pivot){
            right--;
        }
        if(left <= right){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }
    }
            qs(arr,start,right);
            qs(arr, left, end);
    }

}
