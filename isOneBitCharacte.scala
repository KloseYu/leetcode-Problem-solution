object Solution {
    def isOneBitCharacter(bits: Array[Int]): Boolean = {
      var  i = bits.size - 2
        while (i >= 0 && bits(i) == 1){
             i-=1  
         } 
         (bits.size - i) % 2 == 0
    }
}

    
