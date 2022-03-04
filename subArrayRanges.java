class Solution {
    public long subArrayRanges(int[] nums) {
    long ret = 0;
    for (int i = 0; i < nums.length; i++) { 
    int minVal = Integer.MAX_VALUE, maxVal = Integer.MIN_VALUE; 
   for (int j = i; j < nums.length;j++) {
        minVal = Math.min(minVal, nums[j]); 
        maxVal = Math.max(maxVal, nums[j]);
     ret += maxVal - minVal;
      } 
     } return ret;
    }
}
