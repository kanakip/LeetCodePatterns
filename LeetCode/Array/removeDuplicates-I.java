// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

class Solution {
    public int removeDuplicates(int[] nums) {
          // If the array length is less than or equal to 2, no need to process further
        if (nums.length <= 2) {
            return nums.length;
        }

        // Start from the 2nd element, since the first two elements can always be kept
        int index = 2;

        // Traverse the array from the 3rd element onward
        for (int i = 2; i < nums.length; i++) {
            // Check if the current element is greater than the element at `index - 2`
            if (nums[i] != nums[index - 2]) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Return the new length of the array
        return index;
    }
}
