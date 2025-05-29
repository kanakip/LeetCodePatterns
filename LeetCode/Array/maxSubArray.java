
// https://leetcode.com/problems/maximum-subarray/

package Array;

public class maxSubArray {
	
	 public static int maxSubarraySum(int a[]) {
	        int max = a[0];   // Stores the maximum sum
	        int curr = a[0];  // Stores the current subarray sum

	        for (int i = 1; i < a.length; i++) {  // Start from index 1
	            curr = Math.max(a[i], curr + a[i]); // Update current sum
	            max = Math.max(max, curr); // Update max sum if needed
	        }
	        return max;
	    }

	    public static void main(String[] args) {
	        int[] arr = {5,4,-1,7,8};
	        System.out.println("Maximum Subarray Sum: " + maxSubarraySum(arr));
	    }

}
