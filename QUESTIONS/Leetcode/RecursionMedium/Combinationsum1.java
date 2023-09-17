package QUESTIONS.Leetcode.RecursionMedium;

import java.util.ArrayList;
import java.util.List;

public class Combinationsum1 {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8,9};
        int target = 36;
        List<List<Integer>> result = new ArrayList<>() ;
        List<Integer> temp = new ArrayList<>();

        Combination(arr,target,result,temp,0);
        System.out.println(result);
    }

    private static void Combination(int[] arr, int target, List<List<Integer>> result, List<Integer> temp,int index) {
        if(index == arr.length){
            if(target == 0){
                result.add(new ArrayList<>(temp));
            }
            return;
        }

        if(arr[index] <= target) {
            temp.add(arr[index]);
            Combination(arr, target - arr[index], result, temp, index+1);
            temp.remove(temp.size() - 1);

        }
        Combination(arr, target, result, temp, index + 1);
    }
}
