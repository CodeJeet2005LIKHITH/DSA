package LECTURES.Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LinearSearchONMulitpleOccurence {
    public static void main(String[] args) {
        int[]arr = {8,7,6,5,8,1};
        ArrayList<Integer> list  = new ArrayList<Integer>();
//         HERE WE ARE PASSING LIST IN ARGUMENT

        System.out.println(LSOMO(arr,list,8,0));
        System.out.println(LSOMO1(arr,8,0));
        
        
    }
    private static ArrayList<Integer> LSOMO(int[]arr,ArrayList<Integer>list,int target,int start){
        if(start == arr.length-1){
            return list;
        }
        else if (arr[start] == target){
            list.add(start);
        }
        return LSOMO(arr, list, target, ++start);
    }
    // NOT PASSING THROUGH ARGUMENTS
    // RETURN THE LIST AND DONT TAKE IT IN ARGUMENT
    // EVERY CALL WILL HAVE NEW LIST
    private static ArrayList<Integer> LSOMO1(int[]arr,int target,int start){
        ArrayList<Integer> list = new ArrayList<>();
        if(start == arr.length){
            return list;
        }
        if(arr[start] == target){
            list.add(start);
        }
        ArrayList<Integer> Combine_Arrays = LSOMO1(arr, target, ++start);
        list.addAll(Combine_Arrays);
        return list;
    }
    


    
}
