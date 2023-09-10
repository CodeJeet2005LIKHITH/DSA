package LECTURES.Rough;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[]arr=  {5,6,7,4,3,2,1};
        
        System.out.println(RotatedbinarySearch(arr,0,arr.length-1,40));

    }
    private static int RotatedbinarySearch(int[]arr,int start,int end,int target){
        int middle = start+(end-start)/2;

        if(start > end){
            return -1;
        }
        if(arr[middle] == target){
            return middle;
        }
        if(arr[middle] > start){
            if(arr[start] <= target && target <= arr[middle]){
                return RotatedbinarySearch(arr, start, middle-1, target);
            }
            else{
                return RotatedbinarySearch(arr, middle+1, end, target);
            }
        }
        else{
            if(arr[middle] <= target &&  target <= arr[end]){
                return RotatedbinarySearch(arr, middle+1, end, target);
            }
            else{
                return RotatedbinarySearch(arr, start, middle-1, target);
            }
        }
    }
}
