package LECTURES.Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[]arr = {40, 72, 103, 194, 197, 204, 249, 266, 300, 382, 384, 484, 611,
             613, 618, 630, 660, 717, 718, 724, 732, 802, 849, 907, 994
        };
        int ans=Binary_Search(arr,0,arr.length-1,618);
        System.out.println(ans);
    }

    private static int Binary_Search(int[] arr,int start,int end,int target) {
        if(start > end){
            return -1;
        }
        int middle = start+(end-start)/2;
        if(arr[middle] == target){
            return middle;
        }
        else if (arr[middle] > target){
            return Binary_Search(arr, start, middle-1, target);
        }
        else{
            return Binary_Search(arr, middle+1, end, target);
        }

    }
    // Debug
    
}
