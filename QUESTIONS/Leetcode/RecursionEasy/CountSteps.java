package QUESTIONS.Leetcode.RecursionEasy;
// LeetCode Link : https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
/*Given an integer num, return the number of steps to reduce it to zero.

In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
 */

public class CountSteps {
    public static void main(String[] args) {
        int number = 14;
        int count_step = count_step(number,0);
        System.out.println(count_step);
    }
    private static int count_step(int number,int count){
        if(number == 0){
            return count;
        }
        else if(number%2 == 0)return count_step(number/2, ++count);
        else{
            return count_step(number-1, ++count);
        }
    }
    
}
