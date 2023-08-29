package LECTURES.Recursion;
// SumOfNumbers
// FibonnaciNumbers




public class RecurssionBasics2 {
    public static void main(String[] args) {
        int n=5;
        System.out.println(SumOfNumbers(n));
        System.out.println(Fibbo(n));
        
    }

    private static int SumOfNumbers(int n) {
        if(n == 0){
            return 0;
        }
        return n+SumOfNumbers(n-1);
    }
    // Explaination
    // First As usual we pass the argument in the format of an integer 
    // if n == 0 then we should because other wise we will enter the negative number which definetly alter over answer
    // how it works
    // verify the answer with n(n+1)/2;
    // first let us take n == 5;
    // it will check whether n == 0 | or n != 0;
    // now in this case n !=0; So it will proceed.
    // 5+func(4); ==> now the recurssion starts --> e
    // our new n will be 4
    // 4+func(3); --> d
    // our new n will be 3;
    // 3 + func(2); --> c
    // our new n will be 2;
    // 2+func(1); --> b
    // our new n will be 1;
    // 1 + func(0); --> a
    // now n == 0 so it return 0;
    // now the function call will be at "a" the value will 1+0 which is 1;
    // now the function call will be at "b" the value will be 2+1 which is 3;
    // now the function call will be at "c" the value will be 3+3  which will be 6;
    // now the function call will be at "d" the value will be 4+6 which will be 10;
    // now the funtion call will be at "e" the value will be 5+10 which will be 15;
    // now it will return this value to the main function ; and the function call will come out from the main function.
    //  ----------------------THE END-----------------------------
    static int Fibbo(int n){
        // sum of the last  two numbers
        // 0,1,1,2,3,5,8
        // fifth fibonaci number is 5;
        // nth fibonaci number = (n-1)th fibo number + (n-2)fibo number
        // You should get the Thought of Recurssion where the Problem is divind into Continuous Parts;
        // You need to find Base Condition Here.the base condition is N-2 should not be less than 0;
        // so we should N !< 2
        if(n < 2){
            return n;
        }
        return Fibbo(n-1)+Fibbo(n-2);
        // 5 Is Greater than 2 It will allow
        // Now here there recurssions.The left Most Branch will Always takes place first.Lets Observe it,
        // First the 5 will pass through Fibbo(n-1) and n will become 4
        // the 4 will pass through Fibbo(n-1) and n will become 3
        // the 3 will pass through Fibbo(n-1) and n will become 2
        // the 2 will pass through Fibbo(n-1) and n will become 1;
        // Now 1 < 2 so it will return 
        // 1 will be return to 2nd fibbonaci number.
        // Remember to clear Probabal Confusions 0th fibonacci number is 0
        // 1st fibonacci number is 1
        // Now 1 is at the 2nd fibbo
        // Now the second will Call Fibo(n-2) which will be 0;
        // 0 cant go further down(because of restriction)
        // now 0 will be returned to 2nd fibonumebr
        // now second fibbo number = 1 + 0 =1;
        // Now 2nd will return this to 3rd fibonacci number.
        // 3rd fibon number will call fibo(n-2) which is 1;
        // now 1 cannot go further down due to restriction so it will be returned to 3rd fibonacci number
        // 3rd Fibo number = 1 (which is returned from 2 ) + 1 (which is returned from 1) = 2
        // now Function call will go to the 4th Fibo number
        // 4th fibo number will call fibo(n-2) which is "2" 
        // Now 2 can under go further Divisions(2 !< 2)
        // First it will go to its Left Part
        // which will be 1;
        // 1 cannot go furhter divisions so it will return the function call to 2 and now function call will reach right(Fibo(n-2))\
        // which is 0; it cannot go further down so it will return its value to 2;
        // Now  the 2 Fibo number will be Equal to 1 + 0 == 1;
        // Now 2 will return its value to 4;
        // now the value of 4th fibo number is 3rd fibo number + 2nd fibo number = 2 + 1 = 3;
        // now the value of 4th fibo number will be returned to 5;
        // now 5 will call 3rd fibo number;
        // 3rd fibo number will go through further divisions;
        // left division will be 2;
        // right division will be 1;
        // first it will call 2 and 2 can undergo further divisions.
        // left division will be 1;
        // right division will be 0;
        // Both cannot undergo futher division
        // 1 will return its value to 2nd fibo number;
        // 2nd fibo number will call right side(which is 0) and 0 will return its value to 2nd fibo number

        // Now the value of 2nd fibonumber is 1 + 0 which is 1;
        // Now 2nd fibo number will return its value to 3rd fibo number
        // now 3rd fibo number will call its right part which is 1;
        //  1st fibo number cannot undergo any furher divisions
        // the value of 1st fibo number will be returned to 3rd fibo number
        // the value of 3rd fibo number will be 1+1 ==2;
        // now the value of 3rd fibo number will be 2;
        // the value of 5th fibo number will be the value of 4th fibo number + value of 3rd fibo number == 3+2 == 5;


    }



    
}