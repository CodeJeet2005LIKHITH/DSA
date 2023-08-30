package QUESTIONS.Leetcode.RecursionEasy;
// https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
// Contributer : Neeraj Pandey

public class GFG3 {
    public static void main(String[] args) {
        int[]arr = {55,4,3,88,1,-7};
        System.out.println(Min(arr,0));
        System.out.println(Max(arr,0));
        
    }
    // for MinimumValue
    private static int Min(int[]arr,int start){
        if(arr.length == 1){
            return arr[0];
        }
        if(start == arr.length-1){
            return arr[arr.length-1];
        }
        return Math.min(arr[start], Min(arr, ++start));
        
    }
    // For MaximumValue
    private static int Max(int[]arr,int start){
        if(arr.length == 1){
            return arr[0];
        }
        if(start == arr.length-1){
            return arr[arr.length-1];
        }
        return Math.max(arr[start], Max(arr, ++start));
    }
}
