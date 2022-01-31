object Solution {
    def maxDepth(s: String): Int = {
        var ans = 0
        var size = 0
        for ( i <-0 until s.size) //s.length{
            val ch = s.charAt(i)
            if (ch == '(') {
                size+=1
                ans = Math.max(ans, size)
            } else if (ch == ')') {
                size-=1
            }
        }
        ans
    }

}
