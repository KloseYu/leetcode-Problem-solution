import java.util.*
class Solution {
    fun findBall(grid: Array<IntArray>): IntArray {
        val n = grid[0].size
        val ans = IntArray(n)
        Arrays.fill(ans, -1)
        for (j in 0 until n) {
            var col = j // 球的初始列
            for (row in grid) {
                val dir = row[col]
                col += dir // 移动球
                if (col < 0 || col == n || row[col] != dir) {  // 到达侧边或 V 形
                    col = -1
                    break
                }
            }
            if (col >= 0) {  // 成功到达底部
                ans[j] = col
            }
        }
        return ans
    }
}


