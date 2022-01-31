class Solution {
    fun maxDepth(s: String): Int {
          var ans = 0
          var size = 0
        for (i in 0 until s.count()) //s.length{
            val ch = s[i]
            if (ch == '(') {
                ++size
                ans = Math.max(ans, size)
            } else if (ch == ')') {
                --size
            }
        }
        return ans
    }
}
/*class Solution {
    fun maxDepth(s: String): Int {
        var max = 0
        var current = 0
        s.forEach {
            when (it) {
                '(' -> current ++
                ')' -> current --
            }
            max = Math.max(current, max)
        }
        return max
    }
}*/
