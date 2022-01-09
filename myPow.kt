class Solution {
    fun myPow(x: Double, n: Int): Double {
        var varx = x
        var varn = n
        if(varn==0)  return 1.0
        else if (varn < 0) {
            varx = 1 / varx
            varn = -varn
         }
         return fastPow(varx,varn)
    }
    
    fun fastPow(x: Double, n: Int): Double { 
        if (n == 0) {
            return 1.0
        }
        
        var half = fastPow(x, n /2)
        
        if (n % 2 == 0) {
           return half * half 
        }
        else {
           return half * half * x 
        }
    }
}
/*
class Solution {
    fun myPow(x: Double, n: Int): Double {
        var varx = x
        var varn = n
        if(varn==0)  1.0
        else if (varn < 0) {
            varx = 1 / varx
            varn = Math.abs(varn)
         }
         return fastPow(varx,varn)
    }
    
    fun fastPow(x: Double, n: Int): Double { 
        if (n == 0) {
            return 1.0
        }
        
        val half = fastPow(x, n /2)
        
        if (n % 2 == 0) {
           return half * half 
        }
        else {
           return half * half * x 
        }
    }
}
*/
