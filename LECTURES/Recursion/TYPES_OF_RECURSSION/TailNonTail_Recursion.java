// we will understand the difference betwenn teh tail and non tail recursion using one example
// Fibonaci number using tail recursion
// Tail Recursion is more optimized than Non tail recursion 
// The tail recursion is better than non-tail recursion.
//  As there is no task left after the recursive call, 
// it will be easier for the compiler to optimize the code.
//  When one function is called, its address is stored inside the stack. 
// So if it is tail recursion, then storing addresses into stack is not needed.
// A recursive function is tail recursive when the recursive call is the last thing executed by the function.
package LECTURES.Recursion.TYPES_OF_RECURSSION;
public class TailNonTail_Recursion{
    public static void main(String[] args) {
            int n=6;

            System.out.println(TailRecursionFibo(n,0,1));
            System.out.println(NonTailRecursionfibo(n));
            
            
        
    }

    private static int TailRecursionFibo(int n,int a,int b) {
        if(n == 0){
            return a;
        }
        if(n== 1){
            return b;
        }
        return TailRecursionFibo(n-1, b, a+b);
        
        // VISULAIZATION LINK = https://www.recursionvisualizer.com/?function_definition=def%20tail_recursion_fibo%28n%2C%20a%2C%20b%29%3A%0A%20%20%20%20if%20n%20%3D%3D%200%3A%0A%20%20%20%20%20%20%20%20return%20a%0A%20%20%20%20if%20n%20%3D%3D%201%3A%0A%20%20%20%20%20%20%20%20return%20b%0A%20%20%20%20return%20tail_recursion_fibo%28n-1%2C%20b%2C%20a%2Bb%29&function_call=tail_recursion_fibo%285%2C0%2C1%29
    }
    private static int NonTailRecursionfibo(int number){
        if(number < 2){
            return number;
        }
        return NonTailRecursionfibo(number-1)+NonTailRecursionfibo(number-2);
        // VISUILAIZATION LINK = https://www.recursionvisualizer.com/?function_definition=def%20non_tail_recursion_fibo%28number%29%3A%0A%20%20%20%20if%20number%20%3C%202%3A%0A%20%20%20%20%20%20%20%20return%20number%0A%20%20%20%20return%20non_tail_recursion_fibo%28number%20-%201%29%20%2B%20non_tail_recursion_fibo%28number%20-%202%29%0A&function_call=non_tail_recursion_fibo%285%29
        
    }

}
