bool isOneBitCharacter(int* bits, int bitsSize){
    int i = bitsSize - 2; 
    while (i >= 0 && bits[i]) 
    { --i; } 
    return (bitsSize - i) % 2 == 0;
}


