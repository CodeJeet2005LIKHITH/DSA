package LECTURES.Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SubStringProblems {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String str = "LIKHITH";
        substrings(str,"",list);
//        substringswithoutListInArgs(str,"");
        System.out.println(substringswithoutListInArgs(str,""));
//        System.out.println(list);
        System.out.println(substringAscii(str,""));

    };
    private static void substrings(String str, String newString,ArrayList<String> list){
        if(str.isEmpty()){
            list.add(newString);
            return;
        }
        substrings(str.substring(1),newString+str.charAt(0),list);
        substrings(str.substring(1),newString,list);
    }
    private static ArrayList<String> substringswithoutListInArgs(String str,String newString){

        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(newString);
            return list;
        }
        ArrayList<String> left = substringswithoutListInArgs(str.substring(1),newString+str.charAt(0));
        ArrayList<String> right = substringswithoutListInArgs(str.substring(1),newString);
        left.addAll(right);
        return left;
    }
    private static ArrayList<String> substringAscii(String str,String new_string){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(new_string);
            return list;
        }
        ArrayList<String> left = substringAscii(str.substring(1),new_string+str.charAt(0));
        ArrayList<String> middleAscii = substringAscii(str.substring(1),new_string+0);
        ArrayList<String>  right = substringAscii(str.substring(1),new_string);
        left.addAll(middleAscii);
        left.addAll(right);
        return  left;


    }

}
