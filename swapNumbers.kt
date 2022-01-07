class Solution {
    fun swapNumbers(numbers: IntArray): IntArray {
         numbers[0] = numbers[0] xor numbers[1]
         numbers[1] = numbers[1] xor numbers[0]
         numbers[0] = numbers[0] xor numbers[1]
         return numbers
    }
}
