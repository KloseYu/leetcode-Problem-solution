class Solution {
    fun isPowerOfThree(n: Int): Boolean {
        var n=n
         if(n > 1)
            while (n % 3 == 0)
                n /= 3
        return n == 1
    }
}
    
