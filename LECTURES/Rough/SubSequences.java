package LECTURES.Rough;

import java.util.ArrayList;

public class SubSequences {
    public static void main(String[] args) {
        
        System.out.println(subseq("Sandeep",""));
        // 
    }
    private static ArrayList<String> subseq(String old,String New){
        if(old.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(New);
            return list;
        }
        char ch = old.charAt(0);
        ArrayList<String> left = subseq(old.substring(1), ch+New);
        ArrayList<String>Ascci  = subseq(old.substring(1), New+ch+0);
        ArrayList<String> right = subseq(old.substring(1), New);
        left.addAll(right);
        left.addAll(Ascci);
        return left;
        
    }

}
