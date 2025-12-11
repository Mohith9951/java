// LeetCode Problem #26: Remove Duplicates from Sorted Array
// Description: Given an integer array nums sorted in non-decreasing order, 
// remove the duplicates in-place and return the number of unique elements.
// Time Complexity: O(n)
// Space Complexity: O(1)

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        // Two-pointer approach: 'i' for position to write, 'j' for scanning
        int i = 0;
        
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        
        // Return the number of unique elements (index + 1)
        return i + 1;
    }
}
