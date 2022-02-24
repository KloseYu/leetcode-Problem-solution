object Solution {
    def longestPalindrome(s: String): String = {
   var len = s.length
    if(len < 2){
      return s;
    }
    var maxLen = 1
    var res = s.substring(0,1)
    for(i <- 0 to len - 2){
      val oddStr = centerSpread(s,i,i) //奇数
      val evenStr = centerSpread(s,i,i+1) //偶数
      var maxLenStr = if(oddStr.length > evenStr.length) oddStr else evenStr
      if(maxLenStr.length > maxLen){
        maxLen = maxLenStr.length
        res = maxLenStr
      }
    }
    res
  }
  def centerSpread(s:String,l:Int,r:Int):String  = {
    //l = r奇数
    //r= l + 1 偶数
    var len = s.length
    var i = l
    var j = r
    while(i>=0 && j<len && s(i) == s(j)) {
      i-=1
      j+=1
    }
    s.substring(i+1,j)
  }
}
