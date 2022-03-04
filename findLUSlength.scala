object Solution {
    def findLUSlength(a: String, b: String): Int = {
        if (a != b) Math.max(a.length, b.length) else -1 
    }
}
