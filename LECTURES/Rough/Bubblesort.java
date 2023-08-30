package LECTURES.Rough;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[]arr = {5,4,3,2,1};
        Bubblesort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }
    static void Bubblesort(int[]arr,int start,int end){
        if(end == 0){
            return;
        }
        if(end > start){
        if(arr[start] > arr[start+1]){
            int temp =  arr[start];
            arr[start] = arr[start+1];
            arr[start+1] = temp;
            
        }
        Bubblesort(arr, ++start, end);


    }
    else{
        Bubblesort(arr, 0, --end);
    }
}
    
    
}
