import java.util.Arrays
object Solution {
  def minimumDifference(nums: Array[Int], k: Int) = {
    Arrays.sort(nums)
    var ans = Int.MaxValue
    var i = 0
    while ( {
      i + k - 1 < nums.length
    }) {
      ans = Math.min(ans, nums(i + k - 1) - nums(i))
      i += 1
    }
    ans
  }
}
