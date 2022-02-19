class Solution {
    var ans = ArrayList<Int>()
    lateinit var arr:IntArray
    fun pancakeSort(arr: IntArray): List<Int> {
        this.arr = arr
        travel(arr.size - 1)
        return ans
    }
    fun travel(pos:Int): Unit{
        if(pos == 0){
            return
        }
        var target = pos + 1
        var needFlip = false
        for( i in 0 until arr.size){
            if(arr[i] == target){
                if(i == pos){
                    break
                }
                needFlip = true
                if(i == 0){
                    break
                }
                 ans.add(i + 1)
                for(j in 0 .. i/2){
                    var tem = arr[j]
                    arr[j] = arr[i - j]
                    arr[i -j] = tem
                }
               break
            }
        }
        if(!needFlip){
            travel(pos -1)
           return
        }
        ans.add(pos + 1)
        for(l in 0 until (pos + 1) / 2){
            var r = pos - l
            arr[l] = arr[l] xor arr[r]
            arr[r] = arr[r] xor arr[l]
            arr[l] = arr[l] xor arr[r]
        }
        travel(pos -1)
    }
}
/*
class Solution {
    fun pancakeSort(arr: IntArray): List<Int> {
        var ret: List<Int> = ArrayList()
        for (n in arr.size downTo 2) {
            var index = 0
            for (i in 1 until n) {
                if (arr[i] >= arr[index]) {
                    index = i
                }
            }
            if (index == n - 1) {
                continue
            }
            reverse(arr, index)
            reverse(arr, n - 1)
            ret+=index + 1
            ret+=n
        }
        return ret
    }

    fun reverse(arr: IntArray, end: Int) {
        var l = 0
        var r = end
        while (l < r) {
            arr[l] = arr[l] xor arr[r]
            arr[r] = arr[r] xor arr[l]
            arr[l] = arr[l] xor arr[r]
            l++
            r--
        }
    }
}

*/


