// LeetCode Problem #9: Palindrome Number
// Description: Given an integer x, return true if x is a palindrome, and false otherwise.
// Time Complexity: O(log n) where n is the number of digits
// Space Complexity: O(1)

public class Palindrome {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }
        
        // Single digit is always a palindrome
        if (x < 10) {
            return true;
        }
        
        // Numbers ending with 0 cannot be palindromes (except 0)
        if (x % 10 == 0) {
            return false;
        }
        
        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        
        // For even-length numbers: x == reversed
        // For odd-length numbers: x == reversed / 10
        return x == reversed || x == reversed / 10;
    }
}
