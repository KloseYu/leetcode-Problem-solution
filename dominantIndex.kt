class Solution {
    fun dominantIndex(nums: IntArray): Int {
        var m1 = -1
        var m2 = -1
        var index = -1
        for (i in 0 until nums.count()) {
            if (nums[i] > m1) {
                m2 = m1
                m1 = nums[i]
                index = i
            } else if (nums[i] > m2) {
                m2 = nums[i]
            }
        }
        return if (m1 >= m2 * 2) index else -1
    }
}
