class Solution {
    fun numberOfSteps(num: Int): Int {
        var cur = num
        var step = 0
        while (cur > 0) {
            step++
            cur = if ((cur and 1) == 0) { cur shr 1 } else { cur - 1 }
        }
        return step
    }
}
