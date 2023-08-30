package QUESTIONS.Leetcode.RecursionEasy;
// https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/
public class GFG5 {
    // length of the string
    public static void main(String[] args) {
        System.out.println(length("LIKHITH"));
        
    }
    private static int length(String Word){
        if(Word.isEmpty()){
            return 0;
        }
        return length(Word.substring(1))+  1;

    }
    // https://www.recursionvisualizer.com/


    
}
