object Solution {
    def subArrayRanges(nums: Array[Int]): Long = {
     var ret = 0L
    for (i <- 0 until nums.size) { 
    var min = Int.MaxValue
    var max = Int.MinValue
   for (j <- i until nums.size) {
        min = Math.min(min, nums(j))
        max = Math.max(max, nums(j))
     ret += max - min
      } 
   }
        ret
    }
}
