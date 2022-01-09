double myPow(double x, int n){
    if(n == 0)
        return 1;
    else if(n == 1)
        return x;
    else if(n == -1)
        return 1 / x;
    double half = myPow(x,n / 2);
    return half * half * myPow(x,n % 2);
}





 
