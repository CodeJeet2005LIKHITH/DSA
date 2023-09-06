package LECTURES.Recursion;

import java.util.ArrayList;

public class SubStringProblems {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String str = "LIKHITH";
        substrings(str,"",list);
        System.out.println(list);

    };
    private static void substrings(String str, String newString,ArrayList<String> list){
        if(str.isEmpty()){
            list.add(newString);
            return;
        }
        substrings(str.substring(1),newString+str.charAt(0),list);
        substrings(str.substring(1),newString,list);
    }

}
