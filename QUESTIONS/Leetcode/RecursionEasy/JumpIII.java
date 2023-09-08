package QUESTIONS.Leetcode.RecursionEasy;

public class JumpIII {
    public static void main(String[] args) {
        int[]arr = {3,0,2,1,2};
        boolean check = true;
        
        System.out.println(jumpIII(arr,2,check));
    }
    private static Boolean jumpIII(int[]arr,int start,boolean check){
        
        if(start > arr.length-1){
            return false;
        }
        if(start < 0){
            return false;
        }
        if(arr[start] == 0){
            return true;
        }
        check = false;
        boolean Subtract = jumpIII(arr,start-arr[start],check);
        boolean Addition = jumpIII(arr, start+arr[start],check);

        check = true;
        return Subtract || Addition;
    }

    
}
