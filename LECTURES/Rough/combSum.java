package LECTURES.Rough;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class combSum {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8,9};
        int target = 7;
        List<List<Integer>> final_list = new ArrayList<>();
        List<List<Integer>> final_list1 = new ArrayList<>();
        List<Integer> temp_list = new ArrayList<>();
        subsetsum(arr,target,temp_list,final_list,0,3);
        SubSetSum(arr,target,new ArrayList<>(),final_list1,0);
        System.out.println(final_list);
    }

    private static void subsetsum(int[] arr, int target, List<Integer> tempList, List<List<Integer>> finalList,int index,int k) {
        if(index == arr.length){
            if(target == 0 && tempList.size() == k){
                Collections.sort(tempList);
                if(!finalList.contains(tempList) ) {
                    finalList.add(new ArrayList<>(tempList));
                }

            }
            return;
        }
        if(arr[index] <= target) {
            tempList.add(arr[index]);
            subsetsum(arr, target - arr[index], tempList, finalList, index+1,k);
            tempList.remove(tempList.size() - 1);

        }
        subsetsum(arr, target, tempList, finalList, index + 1,k);

    }

//    using for loop

    private static void SubSetSum(int[]arr,int target,List<Integer> tempList,List<List<Integer>> finalList,int start){


        if(target == 0) {

            finalList.add(new ArrayList<>(tempList));
            return;
        }
        if(target <0){
            return;
        }
        for(int i=start; i < arr.length;i++){
            tempList.add(arr[i]);
            SubSetSum(arr,target-arr[i],tempList,finalList,i);
            tempList.remove(tempList.size()-1);

        }
    }



}
