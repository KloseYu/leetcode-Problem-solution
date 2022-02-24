class Solution {
    fun reverseOnlyLetters(s: String): String {
        val n = s.length
        val arr = s.toCharArray()
        var left = 0
        var right = n - 1
        while (true) {
            while (left < right && !Character.isLetter(s[left])) { // 判断左边是否扫描到字母
                left++
            }
            while (right > left && !Character.isLetter(s[right])) { // 判断右边是否扫描到字母
                right--
            }
            if (left >= right) {
                break
            }
            swap(arr, left, right)
            left++
            right--
        }
        return String(arr)
    }
    fun swap(arr: CharArray, left: Int, right: Int) {
         arr[left] = arr[right].also {
            arr[right] = arr[left]
        }
        /*
         val temp = arr[left]
        arr[left] =  arr[right]
        arr[right] = temp
        */
    }
}
