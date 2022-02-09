import java.util.HashMap
object Solution {
  def countKDifference(nums: Array[Int], k: Int) = {
    var res = 0
    val cnt = new HashMap[Int, Int]
    for (j <- 0 until nums.size) {
      res += cnt.getOrDefault(nums(j) - k, 0) + cnt.getOrDefault(nums(j) + k, 0)
      cnt.put(nums(j), cnt.getOrDefault(nums(j), 0) + 1)
    }
    res
  }
}
/*object Solution {
    def countKDifference(nums: Array[Int], k: Int): Int = {
           var res = 0
         for (i <- 0 until nums.size) {
            for (j <- 0 until nums.size) {
                if (Math.abs(nums(i)- nums(j)) == k) {
                    res+=1
                }
         }
        }
        res/2
    }
}*/
