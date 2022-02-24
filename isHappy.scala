object Solution {
    def isHappy(n: Int): Boolean = n match {
            case 1 => true
            case 4 => false
            case _ => isHappy(f(n))
    }
    def f(n: Int): Int = {
        n.toString.map(_ - '0').map(x => x * x).sum
    }
}
