class Solution {
    fun multiply(num1: String, num2: String): String {
        if (num1=="0" || num2=="0") return "0"
        val array = IntArray(num1.count() + num2.count())
        // 从个位数开始逐位相乘
        for (i in num1.count() - 1 downTo 0) {
            for (j in num2.count() - 1 downTo 0) {
                // 一个字符与一个字符相乘
                val mul = (num1[i] - '0') * (num2[j] - '0')
                // 找出相乘的结果在 res 对应的位置添加
                val p1 = i + j
                val p2 = i + j + 1
                // 叠加到 res 上
                val sum = mul + array[p2]
                array[p2] = sum % 10
                // 此处的+=是为了处理此位有了数字
                array[p1] += sum / 10
            }
        }
        // 找到结果前缀那些未使用的0的位置
        val res = StringBuilder()
        var i = 0
        while (array[i] == 0) {
            i++
        }
        // 将计算结果转化成字符串
        while (i < array.count()) {
            res.append(array[i])
            i++
        }
        return res.toString()
    }
}
/*class Solution {
    fun multiply(num1: String, num2: String): String {
        if (num1=="0" || num2=="0") return "0"
        val array = IntArray(num1.count() + num2.count())
        // 从个位数开始逐位相乘
        for (i in num1.length - 1 downTo 0) {
            for (j in num2.length - 1 downTo 0) {
                // 一个字符与一个字符相乘
                val mul = (num1[i] - '0') * (num2[j] - '0')
                // 找出相乘的结果在 res 对应的位置添加
                val p1 = i + j
                val p2 = i + j + 1

                // 叠加到 res 上
                val sum = mul + array[p2]
                array[p2] = sum % 10
                // 此处的+=是为了处理此位有了数字
                array[p1] += sum / 10
            }
        }
        // 找到结果前缀那些未使用的0的位置
        val res = StringBuilder()
        var i = 0
        while (array[i] == 0) {
            i++
        }
        // 将计算结果转化成字符串
        while (i < array.size) {
            res.append(array[i])
            i++
        }
        return res.toString()
    }
}*/
