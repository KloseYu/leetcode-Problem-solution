object Solution {
    def convertToBase7(num: Int): String = {
        var varn:Int = num
        if (varn == 0) return "0"
        val negative = varn < 0
        varn = Math.abs(varn)
        val digits = new StringBuffer
        while ( {
            varn > 0
        }) {
        digits.append(varn % 7)
        varn /= 7
        }
        if (negative) digits.append('-')
        digits.reverse.toString
    }
}
