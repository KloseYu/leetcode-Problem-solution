class Solution {
    fun climbStairs(n: Int): Int {
        val sqrt5 = Math.sqrt(5.0)
        val doublen = n.toDouble()
        val fibN = Math.pow((1.0 + sqrt5) / 2.0,doublen+1) - Math.pow((1 - sqrt5) / 2.0, doublen-1)
        return Math.round(fibN / sqrt5).toInt()
    }
    /*
     fun climbStairs(n: Int): Int {
        val sqrt5 = Math.sqrt(5.0)
        val fibN = Math.pow((1.0 + sqrt5) / 2.0,n.toDouble()+1.0) - Math.pow((1 - sqrt5) / 2.0, n.toDouble()-1.0)
        return Math.round(fibN / sqrt5).toInt()
    }
    */
}
