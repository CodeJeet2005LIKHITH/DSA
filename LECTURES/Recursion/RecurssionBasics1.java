package LECTURES.Recursion;

public class RecurssionBasics1{
    public static void main(String[] args) {
        // Printing  n to 1 numbers
        // Printing 1 to n numbers
       
        int n=5;
        Print_n_to_one(n);
        Print_one_to_n(n);
        
    }
    private static void Print_one_to_n(int n) {
        if(n == 0){
            return;
        }
        Print_one_to_n(n-1);
        System.out.print(n);
        // WE PASSED THE NUMBER IN ARGUMENTS 
        // if number ==0; it returns
        // the return call come out from the Print_one_to_n(n-1);
        // when it come out;there will be Print statement Below it will print(sout) it.
    }



    static void Print_n_to_one(int number){
        if(number == 0){
            return;
        }
        System.out.print(number+" ");
        Print_n_to_one(number-1);
    }
    // NOTES for n to one!!
    // First We give an Integer In the Argumennts
    // It will check whether the number is zero or not.(We need to print only n to 1)
    // when number == 0 then it return(void) and the call will come out from the Print_n_to_one(number-1);
    // But the thing is there is nothing Below this function after n times it will exit from the main function call



}
