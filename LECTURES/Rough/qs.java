package LECTURES.Rough;

import java.util.Arrays;

public class qs {
    public static void main(String[] args) {
        int[]arr = {8,9,2,5,1,4,3};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    private static void quickSort(int[]arr,int start,int end){
        if(start >= end){
            return;
        }
        
        int s = start;
        int e = end;
        int middle = start+(end-start)/2;
        int pivot = arr[middle];
        while (s <= e){
            while(arr[s] < pivot){
                ++s;
            }
            while(arr[e] > pivot){
                --e;
            }
            if(s <= e){
                int temp = arr[e];
                arr[e] = arr[s];
                arr[s] = temp;
                s++;
                e--;
        }
        }

        quickSort(arr, start, e);
        quickSort(arr, s, end);

    }
}
