class Solution {
    fun reversePrefix(word: String, ch: Char): String {
        var word = word
        val index = word.indexOf(ch)
        if (index >= 0) {
            val arr:CharArray = word.toCharArray()
            var l = 0  
            var r = index
            while (l < r) {
                arr[l] = arr[r].also {
                    arr[r] = arr[l]
                }
                l++
                r--
            }
            word =  String(arr)
        }
        return word
        /*val index = word.indexOf(ch)
        return if (index == -1) word
        else {
            val s = word.substring(0,index+1)
            val sb:StringBuilder =  StringBuilder(s)
            sb.reverse()
            sb.toString()+word.substring(index+1,word.length)  
        }*/
       /*
        var word = word
        val index = word.indexOf(ch)
        if (index >= 0) {
            val arr:CharArray = word.toCharArray()
            var l = 0  
            var r = index
            while (l < r) {
                val temp = arr[l]
                arr[l] = arr[r]
                arr[r] = temp
                l++
                r--
            }
            word =  String(arr)
        }
        return word*/
    }
}
