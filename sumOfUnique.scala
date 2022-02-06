import scala.collection.mutable._
object Solution {
    def sumOfUnique(nums: Array[Int]): Int = {  
       var ans = 0
       val state= new HashMap[Int,Int] ()
        for (num <- nums) {
            if (!state.contains(num)) {
                ans += num
                state.put(num, 1)
            } else if (state(num) == 1) {
                ans -= num
                state.put(num, 2)
            }
        }
        ans
    }
}
