object Solution {
    def maximumDifference(nums: Array[Int]): Int = {
        var ans = -1
        var premin = nums(0)
    for (i <- 1 until nums.length) {
      if (nums(i) > premin) ans = Math.max(ans, nums(i) - premin)
      else premin = nums(i)
    }
    ans
    }
}
