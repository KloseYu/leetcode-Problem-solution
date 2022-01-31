object Solution {
    def isUgly(n: Int): Boolean = {
        if(n==0) return false
        else if(n==1 || n==2 || n==3 || n==5)  return true 
        var ans = n
        while (0 == ans % 2)  ans /= 2
        while  (0 == ans % 3)  ans /= 3
        while  (0 == ans % 5)  ans /= 5           
        ans == 1
    }
}
/*object Solution {
    def isUgly(n: Int): Boolean =  n match  {
            case 0 => false
            case 1 => true
            case _ if n % 2 == 0 => isUgly(n / 2)
            case _ if n % 3 == 0 => isUgly(n / 3)
            case _ if n % 5 == 0 => isUgly(n / 5)
            case _ => false     
    }
}*/
