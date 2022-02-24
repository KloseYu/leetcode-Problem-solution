object Solution {
    def multiply(num1: String, num2: String): String = {
         (BigInt(num1) * BigInt(num2)).toString()
    }
}
