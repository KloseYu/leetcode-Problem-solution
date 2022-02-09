class Solution {
    fun countKDifference(nums: IntArray, k: Int): Int {
           var res = 0
         for (i in 0 until nums.size) {
            for (j in 0 until nums.size) {
                if (Math.abs(nums[i]- nums[j]) == k) {
                    res++
                }
         }
        }
        return res/2
    }
}
/*
class Solution {
    fun countKDifference(nums: IntArray, k: Int): Int {
         var res = 0
         val cnt = HashMap<Int, Int>()
        for (j in 0 until nums.size){
            res += cnt.getOrDefault(nums[j] - k, 0) + cnt.getOrDefault(nums[j] + k, 0);
            cnt.put(nums[j], cnt.getOrDefault(nums[j], 0) + 1)
        }
        return res
    }
}
*/
