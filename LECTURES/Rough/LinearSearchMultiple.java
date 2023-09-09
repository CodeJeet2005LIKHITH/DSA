package LECTURES.Rough;

import java.util.ArrayList;

public class LinearSearchMultiple {
    public static void main(String[] args) {
        int[]arr = {8,9,2,5,1,3,4,3};
        System.out.println(Search(arr,0,arr.length,3));
    }
    private static ArrayList<Integer> Search(int[]arr,int start,int end,int target){
        ArrayList<Integer> list = new ArrayList<>();
        if(start == end){
            return list;
        }
        if(arr[start] == target){

            list.add(start);
            
        }
        ArrayList<Integer> ansFromBelowCalls = Search(arr, start+1, end, target);
        list.addAll(ansFromBelowCalls);

        return list;

    }
    
    
}
