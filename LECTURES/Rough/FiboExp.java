package LECTURES.Rough;

public class FiboExp {
    public static void main(String[] args) {
        System.out.println(Fibo(3));
        
    }
    private static int Fibo(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int a = Fibo(n-1);
        System.out.println(n);
       
        int b = Fibo(n-2);
        System.out.println(n);
        
        return a+b;
    }
    
}
