package QUESTIONS.Leetcode.RecursionEasy;

public class GeekoNacciNumbers {
    public static void main(String[] args) {
        System.out.println(GeekoNaci(7));
        
    }
    private static int GeekoNaci(int number){
        if(number == 1){
            return 1;
        }
        if(number == 2){
            return 3;
        }
        if(number == 3){
            return 2;
        }
        return GeekoNaci(number-1)+GeekoNaci(number-2)+GeekoNaci(number-3);
    }
    
}
