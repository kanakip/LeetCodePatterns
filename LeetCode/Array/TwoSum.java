
// https://leetcode.com/problems/two-sum/
package Array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSetI {
	
	 public static int[] twoSum(int[] nums, int target) {
		 HashMap<Integer,Integer> map = new HashMap();
		 for(int i=0;i<nums.length;i++) {
			 int diff = target - nums[i];
			 if(map.containsKey(diff)) {
				 return new int[] {map.get(diff), i};
			 }
			 map.put(nums[i], i);
		 }
		 return null;
	 }
	
	public static void main(String args[]) {
		int nums[] = {2,7,11,15};
		int target =9;
		int[] a = twoSum(nums,target);
		System.out.print(Arrays.toString(a));
	}
}
