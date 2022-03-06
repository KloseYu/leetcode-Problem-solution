class Solution {
    fun convertToBase7(num: Int): String {
        var num = num
        if (num == 0) {
            return "0"
        }
        val negative = num < 0
        num = Math.abs(num)
        val digits = StringBuffer()
        while (num > 0) {
            digits.append(num % 7)
            num /= 7
        }
        if (negative) {
            digits.append('-')
        }
        return digits.reverse().toString()
    }
}
