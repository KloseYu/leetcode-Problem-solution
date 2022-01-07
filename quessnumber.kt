/** 
 * The API guess is defined in the parent class.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * fun guess(num:Int):Int {}
 */

class Solution:GuessGame() {
    override fun guessNumber(n:Int):Int {
        var left = 0
        var right = n
        while (left < right) {
            val mid = (left + right) ushr 1
            if (1 == guess(mid)) {
                left = mid + 1
            } else {
                right = mid
            }
        }
        return left
    }
}

/*class Solution:GuessGame() {
    override fun guessNumber(n:Int):Int {
        var left = 1
        var right = n
        while (left < right) { // 循环直至区间左右端点相同
            val mid = left + (right - left) / 2// 防止计算时溢出
            if (guess(mid) <= 0) {
                right = mid // 答案在区间 [left, mid] 中
            } else {
                left = mid + 1 // 答案在区间 [mid+1, right] 中
            }
        }
        // 此时有 left == right，区间缩为一个点，即为答案
        return left
    }
}*/
