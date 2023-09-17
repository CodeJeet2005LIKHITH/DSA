package LECTURES;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum1 {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8,9};
        int target = 36;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        combination(arr,target,0,result,temp);
        System.out.println(result);
    }
    private static void combination(int[]arr,int target,int ind,List<List<Integer>> result,List<Integer> temp){
        if(ind == arr.length ){
            if(target == 0) {
                result.add(new ArrayList<>(temp));

            }
            return;

        }

        if(arr[ind] <= target){

            temp.add(arr[ind]);
            combination(arr,target-arr[ind],ind,result,temp);
            temp.remove(temp.size()-1);
        }
        combination(arr,target,ind+1,result,temp);
    }
}
