package LECTURES.Rough;

import java.util.ArrayList;
import java.util.List;

public class subsetss {
    public static void main(String[] args) {
        int[]arr = {1,2,3};
        List<List<Integer>> result_list = new ArrayList<>();

        sub_set(arr,new ArrayList<>(),result_list,0);
        System.out.println(result_list);
    }

    private static void sub_set(int[] arr, List<Integer> tempList, List<List<Integer>> resultList,int index) {
        resultList.add(new ArrayList<>(tempList));

        for(int i=index; i < arr.length;i++){
            tempList.add(arr[i]);
            sub_set(arr,tempList,resultList,i+1);
            tempList.remove(tempList.size()-1);
        }

    }

}
