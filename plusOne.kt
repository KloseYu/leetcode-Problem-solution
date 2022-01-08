class Solution {
    fun plusOne(digits: IntArray): IntArray {
        val num = digits[digits.size - 1]
        if(num < 9) {
            digits[digits.size - 1] = num + 1
            return digits
        } else {
            return addEvery(digits, digits.size - 1)
        }
        
    }
    
    fun addEvery(ints: IntArray, now: Int): IntArray {
        var num = ints[now]
        num++
        if(num == 10) {
            ints[now] = 0
            if(now == 0) {//需新建数组
                val newInts = IntArray(ints.size + 1)
                newInts[0] = 1
                for(i in 0 until ints.size) {
                    newInts[i + 1] = ints[i]
                }
                return newInts
            }
            val now2 = now - 1
            return addEvery(ints, now2)
        }
        ints[now] = num
        return ints
    }
}
/*class Solution {
    fun plusOne(digits: IntArray): IntArray {
            if (digits[0] == 0) return intArrayOf(1)
            var d2 = IntArray(digits.size + 1)
            var i = digits.size - 1
            var temp = 0
            while (i >= 0){
                if (i ==digits.size - 1)
                    digits[i] = digits[i] + 1
                else
                    digits[i] = digits[i] + temp
                if (digits[i] > 9) {
                    temp = 1
                    digits[i] = digits[i] % 10
                }
                else
                    temp = 0
                d2[i + 1] = digits[i]
                i--
            }
            if (temp == 1) {
                d2[0] = 1
                return d2
            }else{
                return digits
            }

    }
}*/
