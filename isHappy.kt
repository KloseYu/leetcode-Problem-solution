 import java.util.*
import kotlin.collections.HashSet
 class Solution {
    fun getNext(n: Int): Int {
        var n = n
        var totalSum = 0
        while (n > 0) {
            val d = n % 10
            n = n / 10
            totalSum += d * d
        }
        return totalSum
    }
    fun isHappy(n: Int): Boolean {
        var n = n
        while (n != 1 && !cycleMembers.contains(n)) {
            n = getNext(n)
        }
        return n == 1
    }
    companion object {
        private val cycleMembers: Set<Int> = HashSet(Arrays.asList(4, 16, 37, 58, 89, 145, 42, 20))
    }
}
