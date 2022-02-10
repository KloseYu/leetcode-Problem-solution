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
}


