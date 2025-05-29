
// https://leetcode.com/problems/remove-element/description/

package Array;

public class RemoveElement {
	
	 public static int removeElement(int[] nums, int val) {
		
		 int[] result = new int[nums.length];
		 int count =0;
		 
		 for(int num : nums) {
			 if(num!=val) {
				 result[count] = num;
				 count++;
			 }
		 }
		 
		 return count;
	 }
	 
	public static void main(String args[]) {
		
		int [] nums = {3,2,2,3};
		int val = 3;
		
		int a = removeElement(nums,val);
		System.out.println(a);
		
	}

}
