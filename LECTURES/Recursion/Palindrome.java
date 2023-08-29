package LECTURES.Recursion;

public class Palindrome {
    public static void main(String[] args) {
        boolean Check  = check(1771);
        System.out.println(Check);
    }
    static boolean check(int number){
        int Reversed_number=Reverse_Perfect(number);
        if(Reversed_number == number)return true;
        else{
            return false;
        }
    }
    private static int Reverse_Perfect(int number) {
        int length = (int)(Math.log10(number))+1;
        return helper(number,length);
        
    }
    private static int helper(int number, int length) {
        if(number % 10 == number){
            return number;
        }
        int rem =  number%10;
        return rem*(int)Math.pow(10, length-1)+helper(number/10, length-1);
    }
    
    
}
