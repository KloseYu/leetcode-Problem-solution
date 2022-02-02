object Solution {
    def swapNumbers(numbers: Array[Int]): Array[Int] = {
        Array(numbers(1), numbers(0))
        /*
        numbers(0)^=   numbers(1)
        numbers(1)^=   numbers(0)
        numbers(0)^=   numbers(1)
        numbers
        */
    }
}
