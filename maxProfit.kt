/*class Solution {
    fun maxProfit(prices: IntArray): Int {
        var minprice = Int.MAX_VALUE
        var maxprofit = 0
        for (price in prices) {
            if (price < minprice) {
                minprice = price
            } else if (price - minprice > maxprofit) {
                maxprofit = price - minprice
            }
        }
        return maxprofit
    }
}*/

class Solution {
    fun maxProfit(prices: IntArray): Int {
         var minprice = Int.MAX_VALUE
        var maxprofit = 0
        for ( i in 0 until prices.count()) {
            if (prices[i] < minprice) {
                minprice = prices[i]
            } else if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice
            }
        }
        return maxprofit
    }
}


