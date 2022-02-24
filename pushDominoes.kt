class Solution {
    fun pushDominoes(dominoes: String): String {
        val s = dominoes.toCharArray()
        val n = s.size
        var i = 0
        var left = 'L'
        while (i < n) {
            var j = i
            while (j < n && s[j] == '.') { // 找到一段连续的没有被推动的骨牌
                j++
            }
            val right = if (j < n) s[j] else 'R'
            if (left == right) { // 方向相同，那么这些竖立骨牌也会倒向同一方向
                while (i < j) {
                    s[i++] = right
                }
            } else if (left == 'R' && right == 'L') { // 方向相对，那么就从两侧向中间倒
                var k = j - 1
                while (i < k) {
                    s[i++] = 'R'
                    s[k--] = 'L'
                }
            }
            left = right
            i = j + 1
        }
        return String(s)
    }
}
