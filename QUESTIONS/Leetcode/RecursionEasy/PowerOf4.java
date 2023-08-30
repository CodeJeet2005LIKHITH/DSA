package QUESTIONS.Leetcode.RecursionEasy;

public class PowerOf4 {
    public static void main(String[] args) {
        boolean check=powerOfFour(255);
        System.out.println(check);
        
    }
    private static boolean powerOfFour(int number){
        if(number == 1){
            return true;
        }
        if(number % 4 != 0 ||  number < 1){
            return false;
        }
        return powerOfFour(number/4);
    }
    
}
