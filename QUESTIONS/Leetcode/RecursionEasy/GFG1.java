package QUESTIONS.Leetcode.RecursionEasy;
// [Sum Triangle from Array](https://www.geeksforgeeks.org/sum-triangle-from-array/) `GFG`
// SAGAR SHUKLA

import java.util.Arrays;

public class GFG1 {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        int[]array = new int[arr.length-1];
        Sum(arr,0,arr.length,array);
    }
    private static void Sum(int[]arr,int start,int end,int[]array){
        if(arr.length == 1){
            return;
        }

        if(start < end-1){
            int x= arr[start]+arr[start+1];
            
            array[start] = x;
          
            Sum(arr, ++start, end,array);
        }
        else{
            System.out.println(Arrays.toString(array));
            Sum(array, 0, array.length,new int[array.length-1]);
        }
    }

    
    
}
