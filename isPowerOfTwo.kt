class Solution {
    val big = 1.shl(30)
    fun isPowerOfTwo(n: Int): Boolean {
       return n > 0 && big % n == 0
    }
}
