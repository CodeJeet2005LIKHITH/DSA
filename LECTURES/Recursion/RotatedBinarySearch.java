package LECTURES.Recursion;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[]arr = {5,6,7,8,9,1,2,3};
        int target = 21;

        int ans=Rotated_BinarySearch(arr,target,0,arr.length-1);
        System.out.println(ans);
        
    }
    private static int Rotated_BinarySearch(int[]arr,int target,int start,int end){
        int middle = start+(end-start)/2;
        if(start > end){
            return -1;
        }
        if(arr[middle] == target){
            return middle;
        }
        if(arr[middle] > arr[start]){
            if(arr[start] <= target && target <= arr[end]){
                return Rotated_BinarySearch(arr, target, start, middle-1);
            }
            else{
                return Rotated_BinarySearch(arr, target, middle+1, end);
            }
        }
        else{
            if(arr[middle] <= target && target<= arr[end]){
                return Rotated_BinarySearch(arr, target, middle+1, end);
            }
            else{
                return Rotated_BinarySearch(arr, target, start, middle-1);
            }
        }
        
    }
    
    
}
