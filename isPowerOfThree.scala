object Solution {
    def isPowerOfThree(n: Int): Boolean = n match{
            case 1 => true
            case x if x <= 0 => false
            case x if x % 3 != 0 => false
            case x if x % 3 == 0 => isPowerOfThree(n / 3)
    }
}



