// LeetCode Problem #3: Longest Substring Without Repeating Characters
// Description: Given a string s, find the length of the longest substring without repeating characters.
// Time Complexity: O(n)
// Space Complexity: O(min(m, n)) where m is alphabet size

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int left = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            if (charIndexMap.containsKey(currentChar)) {
                // Move left pointer to avoid duplicate characters
                left = Math.max(left, charIndexMap.get(currentChar) + 1);
            }
            
            charIndexMap.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
