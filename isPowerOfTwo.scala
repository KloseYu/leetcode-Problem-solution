object Solution {
    def isPowerOfTwo(n: Int): Boolean = {
       n > 0 && (n & (n - 1)) == 0
      //val big = 1 << 30 
        //return n > 0 && big % n == 0
    }
}
