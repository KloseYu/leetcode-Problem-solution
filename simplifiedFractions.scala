import java.util.ArrayList
object Solution {
    def simplifiedFractions(n: Int): List[String] = {
    val ans = new ArrayList[String]
    for (denominator <- 2 to n) {
      for (numerator <- 1 until denominator) {
        if (gcd(numerator, denominator) == 1) ans.add(numerator + "/" + denominator)
      }
    }
    ans.toArray.toList.asInstanceOf[List[_]].asInstanceOf[List[String]]
    }
    def gcd(a: Int, b: Int) :Int= if (b != 0) gcd(b, a % b) else a
}
