//const int big = 1 << 30;
bool isPowerOfTwo(int n){
 return    n > 0 && (n & (n - 1)) == 0;
  //return n > 0 && big % n == 0;
}
