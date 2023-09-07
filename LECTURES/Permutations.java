package LECTURES;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String newstring = "";
//        permutations("abc",newstring);
        System.out.println(permuatationsList("abc",newstring));
        

    }
    static void permutations(String str,String newString){
        
        if(str.isEmpty()){
            System.out.println(newString);
            return;
            
        }
        char ch = str.charAt(0);
        for(int i=0; i <= newString.length();i++){
            String first = newString.substring(0, i);
            String next = newString.substring(i, newString.length());
            permutations(str.substring(1), first+ch+next);

        }
        // ArrayList

    }
    static ArrayList<String> permuatationsList(String str,String newString){
        if(str.isEmpty()){
            ArrayList<String>list = new ArrayList<>();
            list.add(newString);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i <= newString.length();i++){
            String first = newString.substring(0, i);
            String next = newString.substring(i,newString.length());
            ans.addAll(permuatationsList(str.substring(1), first+ch+next));

        }
        return ans;
    }

    
}
