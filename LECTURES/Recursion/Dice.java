package LECTURES.Recursion;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        System.out.println(dice(4,""));
    }
    private static ArrayList<String> dice(int number,String newstring){
        if(number == 0){
            ArrayList<String> list  =new ArrayList<>();
            list.add(newstring);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        for(int i=1; i <= 6 && i <= number;i++){
            
            list.addAll(dice(number-1,newstring+i));
        }
        return list;
    }
    
}
