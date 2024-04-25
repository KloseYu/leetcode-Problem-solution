class Solution {
     //模拟法
    /*fun distanceTraveled(mainTank: Int, additionalTank: Int): Int {
      var ans = 0
      var mainTank = mainTank
      var additionalTank = additionalTank
          while (mainTank >= 5) {
              mainTank -= 5
              ans += 50
              if (additionalTank > 0) {
                  additionalTank--
                  mainTank++
              }
          }
          return ans + mainTank * 10
    }*/
    //数学法
     fun distanceTraveled(mainTank: Int, additionalTank: Int): Int {
        return 10 * (mainTank + Math.min((mainTank - 1) / 4, additionalTank))
    }
}
