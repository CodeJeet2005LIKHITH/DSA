package LECTURES.Recursion;

public class ReversingANumber {
        // Passing out of Arguments
        // LINK TO VISUALIZE                  https://www.recursionvisualizer.com/

    static int reversed_number = 0;
    public static void main(String[] args) {
        
        System.out.println(Reverse_one(1234));

    }
    private static int Reverse_one(int i) {
        if(i == 0){
            return reversed_number;
        }
        int rem = i%10;
        reversed_number = reversed_number*10+rem;
        return Reverse_one(i/10);
    }
    
    
}
