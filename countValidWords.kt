class Solution {
    fun countValidWords(sentence: String): Int {
        val n = sentence.count()
        var l  = 0
        var r = 0
        var res = 0
        while (true) {
            while (l < n && sentence[l] == ' ') {
                l++
            }
            if (l >= n) {
                break
            }
            r = l + 1
            while (r < n && sentence[r] != ' ') {
                r++
            }
            if (isValid(sentence.substring(l, r))) { // 判断根据空格分解出来的 token 是否有效
                res++
            }
            l = r + 1
        }
        return res
    }

    fun isValid(word: String): Boolean {
        val n = word.count()
        var hasHyphens = false
        for (i in 0 until n) {
            if (Character.isDigit(word[i])) {
                return false
            } else if (word[i] == '-') {
                if (hasHyphens == true || i == 0 || i == n - 1 || !Character.isLetter(word[i - 1]) || !Character.isLetter(
                        word[i + 1]
                    )
                ) {
                    return false
                }
                hasHyphens = true
            } else if (word[i] == '!' || word[i] == '.' || word[i] == ',') {
                if (i != n - 1) {
                    return false
                }
            }
        }
        return true
    }
}
