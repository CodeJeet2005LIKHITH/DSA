package QUESTIONS.Leetcode.RecursionEasy;

public class check_Prime {
    public static void main(String[] args) {
        int number = 15;
        boolean check=isPrime(number,2);
        System.out.println(check);
    }
    private static boolean isPrime(int number,int count){
        if(number < 1){
            return false;
        }
        if(number % count == 0){
            return false;
        }
        if(number-1 == count){
            return true;
        }
        return isPrime(number, ++count);
  
    }
    
}
