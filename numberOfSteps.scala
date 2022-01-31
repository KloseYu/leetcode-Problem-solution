object Solution {
    def numberOfSteps(num: Int): Int = {
         var cur = num
         var step = 0
        while (cur > 0) {
            step+=1
            cur = if ((cur & 1) == 0) { cur >> 1 } else { cur - 1 }
        }
         step
    }
}
