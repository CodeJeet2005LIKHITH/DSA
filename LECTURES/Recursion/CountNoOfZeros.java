package LECTURES.Recursion;

public class CountNoOfZeros {
   public static void main(String[] args) {
    int countZeros = CountZeros(15203501,0);
    System.out.println(countZeros);
   }

    private static int CountZeros(int number,int count) {
        if(number == 0){
            return count;
        }
        if(number % 10 == 0){
            return CountZeros(number/10, ++count);
        }
        return CountZeros(number/10, count);
    }

}
