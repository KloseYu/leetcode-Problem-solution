import java.util.Arrays
object Solution {
    def maxNumberOfBalloons(text: String): Int = {
         var cnt = new Array[Int](5)
        for (i <- 0 until text.length) {
            val ch = text(i)
            if (ch == 'b') {
                cnt(0)+=1
            } else if (ch == 'a') {
                cnt(1)+=1
            } else if (ch == 'l') {
                cnt(2)+=1
            } else if (ch == 'o') {
                cnt(3)+=1
            } else if (ch == 'n') {
                cnt(4)+=1
            }
        }
        cnt(2) /= 2
        cnt(3) /= 2
    Arrays.stream(cnt).min().getAsInt()
    }
}
