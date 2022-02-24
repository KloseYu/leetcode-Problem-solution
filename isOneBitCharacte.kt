class Solution {
    fun isOneBitCharacter(bits: IntArray): Boolean {
         var  i = bits.size - 2
        while (i >= 0 && bits[i] == 1){
             --i  
         } 
         return (bits.size - i) % 2 == 0
    }
}

