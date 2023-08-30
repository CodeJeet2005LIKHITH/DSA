package QUESTIONS.Leetcode.RecursionEasy;
// https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
// Contributer : Neeraj Pandey

public class GFG3 {
    public static void main(String[] args) {
        int[]arr = {5,4,3,8,1};
        System.out.println(Min(arr,0));
        
    }
    private static int Min(int[]arr,int start){
        if(arr.length == 1){
            return arr[0];
        }
        if(start == arr.length-1){
            return arr[arr.length-1];
        }
        return Math.max(arr[start], Min(arr, ++start));
    }
}
