//Given an integer x, return true if x is palindrome integer.

//An integer is a palindrome when it reads the same backward as forward.

//For example, 121 is a palindrome while 123 is not.

class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int reverse = 0;
                if (x < 0) {
            return false;
        }
       
        
        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
        return x == reverse;
    }
}