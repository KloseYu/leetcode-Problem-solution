class Solution {
    fun subArrayRanges(nums: IntArray): Long {
    var ret = 0L
    for (i in 0 until nums.size) { 
    var min = Int.MAX_VALUE 
    var max = Int.MIN_VALUE
   for (j in i until nums.size) {
        min = Math.min(min, nums[j])
        max = Math.max(max, nums[j])
     ret += max - min
      } 
   }
        return ret
    }
}
