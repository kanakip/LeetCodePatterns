
// https://leetcode.com/problems/merge-sorted-array

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int total = m+n;
        int i=0;
        int[] a = new int [total];
        for(int elements: nums1){
           if(i<m){
            nums1[i] = elements;
            i++;
            }
        }
           
          int j=0; 
         for(int elements: nums2){
             if(j<n){
              nums1[i] = elements;
              j++;
              i++;
             }
        }
        Arrays.sort(nums1);
        
    }
}
