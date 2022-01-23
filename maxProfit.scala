object Solution {
    def maxProfit(prices: Array[Int]): Int = {
        var minprice = Int.MaxValue
        var maxprofit = 0
        for (price <- prices) {
            if (price < minprice) {
                minprice = price
            } else if (price - minprice > maxprofit) {
                maxprofit = price - minprice
            }
        }
        return maxprofit
    }
}
