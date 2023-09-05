package LECTURES.Rough;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSoooort {
    public static void main(String[] args) {
        int[]arr = {8,2,1,9,4,5};
        merge_sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    private static void merge_sort(int[]arr,int start,int end){
        if(start >= end){
            return;
        }
        int middle = start+(end-start)/2;
        merge_sort(arr, start, middle);
        merge_sort(arr, middle+1, end);
        merge(arr, start,middle, end);
    }
    private static void merge(int[]arr,int start,int middle,int end){
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
        for(int i=start;i <= end;i++){
            arr[i] = temp.get(i-start);
        }
    }
    
}
