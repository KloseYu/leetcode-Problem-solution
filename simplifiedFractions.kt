 class Solution {
    fun simplifiedFractions(n: Int): List<String> {
        val ans: MutableList<String> = ArrayList()
        for (denominator in 2..n) {
            for (numerator in 1 until denominator) {
                if (gcd(numerator, denominator) == 1) {
                    ans.add("$numerator/$denominator")
                }
            }
        }
        return ans
    }

    fun gcd(a: Int, b: Int): Int {
        return if (b != 0) gcd(b, a % b) else a
    }
    
    /*fun simplifiedFractions(n: Int): List<String> {
        if (n == 1) {
            return ArrayList()
        }
        val list = ArrayList<String>()
        for (i in 2..n) {
            for (j in 1 until i) {
                if (gcd(j, i) != -1) {
                    continue
                }
                list.add("$j/$i")
            }
        }
        return list
    }

    fun gcd(m: Int, n: Int): Int {
        var t = 2
        while (t <= m && t <= n) {
            if (m % t == 0 && n % t == 0) {
                return t
            }
            t++
        }
        return -1
    }*/

}


