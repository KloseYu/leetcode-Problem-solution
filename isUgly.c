bool isUgly(int n){
        switch(n){
          case  0 : return false;
          case  1:return true;
          case  2:return true;
          case  3:return true;
          case  5:return true;
        }
        int ans = n;
        while (0 == ans % 2)  ans /= 2;
        while (0 == ans % 3)  ans /= 3;
        while (0 == ans % 5)  ans /= 5;           
        return ans == 1;
}
/*
bool isUgly(int n){
        if (n==0) return false;
        else if(n==1 || n==2 || n==3 || n==5) return true;
        int ans = n;
        while (0 == ans % 2)  ans /= 2;
        while (0 == ans % 3)  ans /= 3;
        while (0 == ans % 5)  ans /= 5;           
        return ans == 1;
}
*/
