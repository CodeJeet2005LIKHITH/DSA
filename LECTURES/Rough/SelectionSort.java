package LECTURES.Rough;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[]arr = {4,3,2,1};
        selection(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[]arr,int r,int c,int max){
        if(r ==0){
            return;
        }
        if(c < r) {
            if (arr[c] > arr[max]) {
                selection(arr, r, c + 1, c);
            } else {
                selection(arr, r, c + 1, max);
            }
        }
        else{
            int temp = arr[c-1];
            arr[c-1] = arr[max];
            arr[max] = temp;
            selection(arr,r-1,0,0);
        }

    }

    
}
