package LECTURES.Rough;

import java.util.ArrayList;
import java.util.Arrays;

public class mms {
    public static void main(String[] args) {
        int[]arr = {72,55,89,25,101,95,143,2,150,65,185};
        mergesort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergesort(int[] arr, int start, int end) {
        if(start >= end){
            return;
        }
        int middle = start+(end-start)/2;
        mergesort(arr, start, middle);
        mergesort(arr, middle+1, end);
        Merge(arr,start,middle,end);
    }
    private static void Merge(int[]arr,int start,int middle,int end){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = start;
        int right = middle+1;
        while(left <= middle && right <= end){
            if(arr[left] < arr[right]){
                temp.add(arr[left]);
                ++left;
            }
            else{
                temp.add(arr[right]);
                ++right;
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
        for(int i = start; i <= end;i++){
            arr[i]  = temp.get(i-start);
        }
    }
}
