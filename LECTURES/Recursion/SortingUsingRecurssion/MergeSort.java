package LECTURES.Recursion.SortingUsingRecurssion;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[]arr = {81,80,7,35675,7896,58458,45,36,54,72,90};
        Ms(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        

    }
    private static void mergesort(int[]arr,int middle,int start,int end){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = start;
        int right = middle+1;
        while(left <= middle && right <= end){
            if(arr[left] > arr[right]){
                temp.add(arr[right]);
                right++;
            }
            else{
                temp.add(arr[left]);
                left++;
            }
        }
        while(left <= middle){
            temp.add(arr[left]);
            left++;
        }
        while(right <= end){
            temp.add(arr[right]);
            right++;
        }
        for(int i=start;i<= end;i++){
            arr[i] = temp.get(i-start);
        }
        
    }
    private static void Ms(int[]arr,int start,int end){
        if(start >= end){
            return;
        }
        int middle = start+(end-start)/2;

        Ms(arr, start, middle);
        Ms(arr, middle+1, end);
        mergesort(arr,middle,start,end);
    }
    
    
}
