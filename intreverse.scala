object Solution {
    def reverse(x: Int): Int = {
        var y = x
        var r = 0
        while (y != 0) {
            val p = y % 10
            if ((r > 0 && r > (Int.MaxValue - y) / 10) || (r < 0 && r < (Int.MaxValue - y) / 10)) {
                return 0
            }
            r = r * 10 + p
            y /= 10
        }
        return r
    }
}
