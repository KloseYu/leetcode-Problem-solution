class Solution {
    fun minimumDifference(nums: IntArray, k: Int): Int {
        var res: Int=Int.MAX_VALUE
        nums.sort()
        nums.reverse()
        for(i in k-1..nums.size-1)
        {
            res=Math.min(res,nums[i-k+1]-nums[i])
        }
        return res
    }
    /*
    fun minimumDifference(nums: IntArray, k: Int): Int {
        val n = nums.size
        Arrays.sort(nums)
        var ans = Int.MAX_VALUE
        var i = 0
        while (i + k - 1 < n) {
            ans = Math.min(ans, nums[i + k - 1] - nums[i])
            ++i
        }
        return ans
    }*/
}



