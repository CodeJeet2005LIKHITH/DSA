package LECTURES.Rough;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int []arr = {5,4,3,2,1};
        Merge_Sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    private static void Merge_Sort(int[]arr,int start,int end){
        if(start >= end){
            return;
        }
        int middle = start+(end-start)/2;
        Merge_Sort(arr, start, middle);
        Merge_Sort(arr, middle+1, end);
        Merge(arr, start,middle, end);
    }
    private static void Merge(int[]arr,int start,int middle,int end){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = start;
        int right = middle+1;
        while(left<= middle && right <= end){
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
            ++left;
        }
        while(right <= end){
            temp.add(arr[right]);
            ++right;
        }
        for(int i=start; i <= end;i++){
            arr[i] = temp.get(i-start);

        }
    }

    
}
