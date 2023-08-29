package LECTURES.Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[]arr = {50,45,40,35,30,25,20,15,10,5,1};
        int index=Linear_Search(arr,0,5);
        System.out.println(index);
    }
    static int Linear_Search(int[]arr,int start,int target){
        if(start == arr.length-1){
            return -1;
        }
        if(arr[start] == target){
            return start;
        }
        return Linear_Search(arr, start+1, target);

    }
    // Debug
    // 
    
}
