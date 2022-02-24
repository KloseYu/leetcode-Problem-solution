object Solution {
    def climbStairs(n: Int): Int = {
        val sqrt5 = Math.sqrt(5)
        val fibn = Math.pow((1 + sqrt5) / 2, n + 1) - Math.pow((1 - sqrt5) / 2, n + 1)
        return Math.round(fibn / sqrt5).toInt
    }
}




