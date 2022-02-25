 class Solution {
    fun maximumDifference(nums: IntArray): Int {
        var ans = -1
        var premin = nums[0]
        for (i in 1 until nums.size) {
            if (nums[i] > premin) {
                ans = Math.max(ans, nums[i] - premin)
            } else {
                premin = nums[i]
            }
        }
        return ans
    }
}
