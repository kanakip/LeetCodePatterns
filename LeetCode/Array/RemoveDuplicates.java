
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

package Array;

import java.util.HashSet;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
    	
    	HashSet<Integer> set = new HashSet<Integer>();
    	
    	for(int num : nums) {
    		set.add(num);
    	}
    	
    	return set.size();
    	
   }
    
    public static void main(String args[]) {
    	
    	int[] nums = {0,0,1,1,1,2,2,3,3,4};
    	
    	int a = removeDuplicates(nums);
    	System.out.print(a);
    }
    
}


