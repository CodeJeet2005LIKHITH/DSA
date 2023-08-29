package LECTURES.Recursion;

public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
        System.out.println(Sum(1234, 0));
        System.out.println(SUM(812552849));
    }
    private static int SUM(int n) {
        if(n%10 == n){
            return n;
        }
        int digits=helper(n);
        int rem = n%10;
        return rem*(int)Math.pow(10, digits-1)+SUM(n/10);

        
    }
    private static int helper(int n) {
        int length = (int)Math.log10(n);
        return length;
    }
    static int Sum(int number,int sum){
        // 1234 = 1+2+3+4;
        if(number == 0){
            return sum;
        }
        return Sum(number/10, sum+number%10);

    }
    // NOW WILL WE SEE HOW WE CAN DO IT WITH TAKING VALUE IN ARGUMENTS
    

    
    
}
