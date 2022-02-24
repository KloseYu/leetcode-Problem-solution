import java.util.*
class Solution {
    fun maxNumberOfBalloons(text: String): Int {
        var cnt = IntArray(5)
        for (i in 0 until text.length) {
            val ch = text[i]
            /*when (ch) {
                'b' -> {
                    cnt[0]++
                }
                'a' -> {
                    cnt[1]++
                }
                'l' -> {
                    cnt[2]++
                }
                'o' -> {
                    cnt[3]++
                }
                'n' -> {
                    cnt[4]++
                }
            }*/
             if (ch == 'b') {
                cnt[0]++
            } else if (ch == 'a') {
                cnt[1]++
            } else if (ch == 'l') {
                cnt[2]++
            } else if (ch == 'o') {
                cnt[3]++
            } else if (ch == 'n') {
                cnt[4]++
            }
        }
        cnt[2] /= 2
        cnt[3] /= 2
        return Arrays.stream(cnt).min().getAsInt()
    }
}


