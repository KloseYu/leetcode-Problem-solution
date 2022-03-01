object Solution {
  def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit={
    var p1 = m - 1
    var p2 = n - 1
    var tail = m + n - 1
    var cur = 0
    while ( {
      p1 >= 0 || p2 >= 0
    }) {
      if (p1 == -1) cur = nums2({
        p2 -= 1; p2 + 1
      })
      else if (p2 == -1) cur = nums1({
        p1 -= 1; p1 + 1
      })
      else if (nums1(p1) > nums2(p2)) cur = nums1({
        p1 -= 1; p1 + 1
      })
      else cur = nums2({
        p2 -= 1; p2 + 1
      })
      nums1({
        tail -= 1; tail + 1
      }) = cur
    }
  }
}
