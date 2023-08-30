package QUESTIONS.Leetcode.RecursionEasy;
// https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/

public class GFG4 {
    public static void main(String[] args) {
       char character= Uppercase("liKhith",0);
       System.out.println(character);
    }
    private static char Uppercase(String word,int pointer){
        if(pointer > word.length()){
            return '#';
        }
        if('A' <= word.charAt(pointer) && word.charAt(pointer) <= 'Z'){
            return word.charAt(pointer);
        }
        else{
            return Uppercase(word, ++pointer);
        }
        
    }

    
}
