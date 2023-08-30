package QUESTIONS.Leetcode.RecursionEasy;

public class isPowerOf2 {
    public static void main(String[] args) {
        int number = 16;
        boolean check = isPowerOfTwo(number);
        System.out.println(check);
    }
    private static boolean isPowerOfTwo(int number){
        if(number == 0){
            return false;
        }
        if(number == 1){
            return true;
        }
        if(number % 2 != 0){
            return false;
        }
        return isPowerOfTwo(number/2);
    }
    
}
