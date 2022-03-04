class Solution {
    fun findLUSlength(a: String, b: String): Int {
        return if (a != b) Math.max(a.length, b.length) else -1 
    }
}
