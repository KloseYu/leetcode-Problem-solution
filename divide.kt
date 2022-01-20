class Solution {
    fun divide(dividend: Int, divisor: Int): Int {
         if (dividend == 0) {
            return 0
        }
        else if (dividend == Int.MIN_VALUE && divisor == -1) {
            return Int.MAX_VALUE
        }
        val  negative = (dividend xor divisor) <0 //用异或来计算是否符号相异
        var t = Math.abs(dividend.toLong())
        val d= Math.abs(divisor.toLong())
        var result = 0
        for (i in 31 downTo 0) {
            if ((t shr i)>=d) {//找出足够大的数2^n*divisor
                result+=1 shl i//将结果加上2^n
                t-= d shl i//将被除数减去2^n*divisor
            }
        }
        return if (negative) -result else  result
    }
}
