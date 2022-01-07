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
