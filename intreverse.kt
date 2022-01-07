/*class Solution {
    fun reverse(x: Int): Int {
        var y = x
        var r = 0
        while (y != 0) {
            val p = y % 10
            if ((r > 0 && r > (Int.MAX_VALUE - y) / 10) || (r < 0 && r < (Int.MIN_VALUE - y) / 10)) {
                return 0
            }
            r = r * 10 + p
            y /= 10
        }
        return r
    }
}*/
class Solution {
    fun reverse(x: Int): Int {
        var r = 0
        var y = x
        while (y != 0) {
             if (r <Int.MIN_VALUE / 10 || r > Int.MAX_VALUE / 10) {
            return 0
        }
        val digit = y % 10
        y /= 10
        r = r * 10 + digit
        }    
        return r
    }
}
