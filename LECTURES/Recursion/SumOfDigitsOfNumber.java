package LECTURES.Recursion;

public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
        System.out.println(Sum(1234, 0));
        
    }

    static int Sum(int number,int sum){
        // 1234 = 1+2+3+4;
        if(number == 0){
            return sum;
        }
        return Sum(number/10, sum+number%10);

    }
    
    

    
    
}
