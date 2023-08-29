package LECTURES.Recursion;

public class IsSorted {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,9,5};
        boolean check  = isSorted(arr,0);
        System.out.println(check);
    }
    static boolean isSorted(int []arr,int start){
        if(start == arr.length-2){
            return true;
        }
        else if (arr[start] > arr[start+1])return false;
        return isSorted(arr, start+1);

    }
}
