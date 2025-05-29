// https://leetcode.com/problems/first-missing-positive/description/

package Array;

import java.util.Arrays;

public class FirstMissingPositive {
	
	public static int firstMissingPositive(int[] nums) {
		
		Arrays.sort(nums);
		
		int i=1;
		
		for(int num : nums) {
			if(i==num) {
				i++;
			}
		}
		return i;
	}
	
	public static void main(String args[]) {
		
		int[] nums = {7,8,9,11,12};
		
		int a = firstMissingPositive(nums);
		
		System.out.println(a);
	}

}
