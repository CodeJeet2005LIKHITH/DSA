package LECTURES.Rough;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[]arr=  {5,4,3,1,2};
        RotatedbinarySearch(arr,0,arr.length-1,4);

    }
    private static int RotatedbinarySearch(int[]arr,int start,int end,int target){
        int middle = start+(end-start)/2;
        if(arr[middle] > start){
            if(arr[start] <= target && arr[middle] <= target){
                return RotatedbinarySearch(arr, start, middle-1, target);
            }
            else{
                return RotatedbinarySearch(arr, middle+1, end, target);
            }
        }
        else{
            if(arr[middle] <=)
        }
    }
}
