class Solution {
    //static final int big = 1 <<30;
    public boolean isPowerOfTwo(int n) {
         //return n > 0 && big % n == 0;
          return    n > 0 && (n & (n - 1)) == 0;
    } 
}
