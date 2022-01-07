int reverse(int x)
{
       int num=0;
    while(x/10){
        num=num*10+x%10;
        x/=10;
    }
    if((num>INT_MAX/10)||((num==INT_MAX/10)&&(x>7)))   return 0;
    else if((num<INT_MIN/10)||((num==INT_MIN/10)&&(x<-8)))  return 0;
    else    return num*10+x;
}
/*int reverse(int x) {
    int rev = 0;
    while (x != 0) {
        if (rev < INT_MIN / 10 || rev > INT_MAX / 10) {
            return 0;
        }
        int digit = x % 10;
        x /= 10;
        rev = rev * 10 + digit;
    }
    return rev;
}*/
