// https://leetcode.com/problems/plus-one

class Solution {
    public int[] plusOne(int[] digits) {
       
        int n = digits.length;
        
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }else{
                digits[i]=0;
            }
        }
        
        int[] newNum = new int[n+1];
        newNum[0]=1;
        return newNum;
    }
}
