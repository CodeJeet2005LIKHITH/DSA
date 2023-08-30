package QUESTIONS.Leetcode.RecursionEasy;

public class PowerOft3 {
    public static void main(String[] args) {
        boolean check=powerOfThree(15);
        
        System.out.println(check);


        
    }
    private static boolean powerOfThree(int number){
        if(number == 1){
            return true;
        }
        if(number % 3 != 0 ||  number < 1){
            return false;
        }
        return powerOfThree(number/3);


    }

}
