import java.util.ArrayList
import scala.util.control.Breaks
object Solution {
  def pancakeSort(arr: Array[Int]): List[Int] = {
    val ret = new  ArrayList[Int]
    for (n <- arr.length until 1 by -1) {
      var index = 0
      for (i <- 1 until n) {
        if (arr(i) >= arr(index)) index = i
      }
      val br = new Breaks
      br.breakable{
      if (index == n - 1) {
           br.break
      } }
      reverse(arr, index)
      reverse(arr, n - 1)
      ret.add(index + 1)
      ret.add(n)
    }
    ret.toArray.toList.asInstanceOf[List[_]].asInstanceOf[List[Int]]
  }

  def reverse(arr: Array[Int], end: Int) = {
    var l = 0
    var r = end
    while (l < r) {
      arr(l) ^= arr(r)
      arr(r) ^= arr(l)
      arr(l) ^= arr(r)
      l += 1
      r -= 1
    }
  }
}
