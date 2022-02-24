class Solution {
    //val big = 1.shl(30)
    fun isPowerOfTwo(n: Int): Boolean {
      // return n > 0 && big % n == 0
      return    n > 0 && (n and (n - 1)) == 0
    }
}
