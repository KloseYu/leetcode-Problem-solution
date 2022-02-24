object Solution {
    def pushDominoes(dominoes: String): String = {
    val s = dominoes.toCharArray
    val n = s.size
    var i = 0
    var left = 'L'
    while ( {
      i < n
    }) {
      var j = i
      while ( {
        j < n && s(j) == '.'
      }) { // 找到一段连续的没有被推动的骨牌
        j += 1
      }
      val right = if (j < n) s(j)
      else 'R'
      if (left == right) { // 方向相同，那么这些竖立骨牌也会倒向同一方向
        while ( {
          i < j
        }) s({
          i += 1; i - 1
        }) = right
      }
      else if (left == 'R' && right == 'L') { // 方向相对，那么就从两侧向中间倒
        var k = j - 1
        while ( {
          i < k
        }) {
          s({
            i += 1
            i - 1
          }) = 'R'
          s({
            k -= 1 
            k + 1
          }) = 'L'
        }
      }
      left = right
      i = j + 1
    }
    new String(s)
    }
}
