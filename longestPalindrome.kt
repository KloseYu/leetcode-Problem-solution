class Solution {
    fun longestPalindrome(s: String): String {
        var res = ""
        for (i in 0 until s.length) {
            // 以 s[i] 为中心的最长回文子串
            val s1 = palindrome(s, i, i)
            // 以 s[i] 和 s[i+1] 为中心的最长回文子串
            val s2 = palindrome(s, i, i + 1)
            // res = longest(res, s1, s2)
            res = if (res.length > s1.length) res else s1
            res = if (res.length > s2.length) res else s2
        }
        return res
    }

    /**
    * 以 l r 为中心点，找最大回文子串
    */
    fun palindrome(s: String, l: Int, r: Int): String {
        // 防止索引越界
        var l = l
        var r = r
        while (l >= 0 && r < s.length && s[l] == s[r]) {
            // 向两边展开
            l--
            r++
        }
        // 返回以 s[l] 和 s[r] 为中心的最长回文串
        return s.substring(l + 1, r)
    }
}



