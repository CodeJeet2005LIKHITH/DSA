package LECTURES.Recursion;

public class ReversingANumber {
        // Passing out of Arguments
        // LINK TO VISUALIZE                  https://www.recursionvisualizer.com/

    static int reversed_number = 0;
    public static void main(String[] args) {
        
        System.out.println(Reverse_one(1234));
        System.out.println(Reverse_Perfect(812));

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
    private static int Reverse_one(int i) {
        if(i == 0){
            return reversed_number;
        }
        int rem = i%10;
        reversed_number = reversed_number*10+rem;
        return Reverse_one(i/10);
    }
    // Now passing through Arguments

    
    
}
