package QUESTIONS.Leetcode.RecursionEasy;
//  https://leetcode.com/problems/power-of-two/
// 231. Power of Two


public class Easy1 {
    class Solution {
        // using Recurssion
        public boolean isPowerOfTwo(int n) {
            if(n == 0){
                return false;
            }
            if(n == 1){
                return true;
            }
            if(n % 2 != 0){
                return false;
            }
    
            else{
                return isPowerOfTwo(n/2);
            }
    
        }
    }
}
