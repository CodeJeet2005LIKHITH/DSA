package LECTURES.Rough;

import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
        String str = "abc";
        String newStr = "";
        System.out.println(permuatationsList(str,newStr));
        
    }
    static ArrayList<String> permuatationsList(String str,String newString){
        if(str.isEmpty()){
            ArrayList<String>list = new ArrayList<>();
            list.add(newString);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList <String> ans = new ArrayList<>();
        for(int i=0; i <= newString.length();i++){
            String first = newString.substring(0, i);
            String next = newString.substring(i, newString.length());
        ans.addAll(permuatationsList(str.substring(1), first+ch+next));
    }
    return ans;
}
}
