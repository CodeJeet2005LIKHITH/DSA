package LECTURES.Rough;

public class FiboNacci {
    public static void main(String[] args) {
        
        System.out.println(Fibo(6));
    }
    private static int Fibo(int n){
        if(n == 0 || n == 1){
            return n;
        }
        System.out.println(n);
        return Fibo(n-1)+Fibo(n-2);
        
        

    }
    
}
