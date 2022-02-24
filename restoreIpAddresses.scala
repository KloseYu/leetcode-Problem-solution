import scala.collection.mutable.ListBuffer
object Solution {
  def restoreIpAddresses(s: String): List[String] = {
    val ans = ListBuffer[String]()
    def dfs(s: String, idx: Int, termNum: Int, path: String): Unit = {
      if (termNum == 4) {
        if (idx == s.length && s.length + 3 == path.length - 1)
          ans += path.substring(1)
        return
      }
      if (termNum > 4)
        return
      var term = 0
      for (i <- idx until s.length) {
        if (s(i) == '0' && term == 0)
          dfs(s, i + 1, termNum + 1, path + ".0")
        else {
          term = term * 10 + s(i) - '0'
          if (term > 255)
            return
          else
            dfs(s, i + 1, termNum + 1, path + s".${term}")
        }
      }
    }
    dfs(s, 0, 0, "")
    ans.toList
  }
}
