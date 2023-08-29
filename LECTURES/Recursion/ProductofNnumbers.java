package LECTURES.Recursion;
// Factorial

public class ProductofNnumbers {
    public static void main(String[] args) {
        int n=5;
       int ans= Product(n);
       System.out.println(ans);
    }
    static int Product(int n){
        if(n - 1 == 0){
            return n;
        }
        return n*Product(n-1);
    }
    
}
