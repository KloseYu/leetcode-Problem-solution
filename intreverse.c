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
