object Solution {
  // 定义一个twoSum函数，接受一个整数数组和一个目标整数，返回一个整数数组
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    // 遍历数组的索引，从0到数组的长度减1
    for (i <- 0 until nums.size) {
      // 遍历数组的索引，从i+1到数组的长度减1
      for (j <- i + 1 until nums.size) {
        // 如果数组中第i个元素和第j个元素的和等于目标整数
        if (nums(i) + nums(j) == target) {
          // 返回一个包含i和j的数组
           
           return Array(i, j)
        }
      }
    }
    // 返回一个空数组
    Array()
  }
}
