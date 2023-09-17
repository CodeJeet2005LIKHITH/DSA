package LECTURES.Rough;

import java.util.ArrayList;
import java.util.List;

public class subsets {
    public static void main(String[] args) {
        int[]arr = {1,2,3};
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        ss(arr,resultList,tempList,0);
        System.out.println(resultList);
    }
    private static void ss(int[]arr,List<List<Integer>> returnList, List<Integer> tempList,int index){
        if(index == arr.length){
            returnList.add(new ArrayList<Integer>(tempList));
            return;
        }
        tempList.add(arr[index]);
        ss(arr,returnList,tempList,index+1);
        tempList.remove(tempList.size()-1);
        ss(arr,returnList,tempList,index+1);

    }
}
