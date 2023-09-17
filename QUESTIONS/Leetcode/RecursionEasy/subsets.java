package QUESTIONS.Leetcode.RecursionEasy;

import java.util.ArrayList;
import java.util.List;

public class subsets {
    public static void main(String[] args) {
        int[]arr=  {1,2,3};
        List<List<Integer>> result_list = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        sub_sets(arr,result_list,tempList,0);
        System.out.println(result_list);
    }
    private static void sub_sets(int[]arr,List<List<Integer>> result_list,List<Integer> temp_list,int index){

        result_list.add(new ArrayList<>(temp_list));
        for(int i=index; i < arr.length;i++){
            temp_list.add(arr[i]);
            sub_sets(arr, result_list, temp_list, index+1);
            temp_list.remove(temp_list.size()-1);

        }
    }
}
