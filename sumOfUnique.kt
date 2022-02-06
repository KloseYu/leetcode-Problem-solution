class Solution {
    fun sumOfUnique(nums: IntArray): Int {
        var res = 0
        val state = HashMap<Int, Int>()
        for (num in nums) {
            if (!state.contains(num)){//!state.containsKey(num)
                res += num
                state.put(num, 1)
            } else if (state.get(num) == 1) {
                res -= num
                state.put(num, 2)
            }
        }
        return res
    }
}
